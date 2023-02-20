package laddergame.controller;

import laddergame.domain.*;
import laddergame.view.InputView;
import laddergame.view.LadderFormGenerator;
import laddergame.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

import static laddergame.utils.RetryUtils.retryOnRuntimeExceptionWithMessage;

public class LadderController {
    private final InputView inputView;
    private final OutputView outputView;
    private final BooleanGenerator booleanGenerator;
    private final LadderFormGenerator ladderFormGenerator = new LadderFormGenerator();

    public LadderController(final InputView inputView,
                            final OutputView outputView,
                            final BooleanGenerator booleanGenerator
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.booleanGenerator = booleanGenerator;
    }

    public void run() {
        final Participants participants = retryOnRuntimeExceptionWithMessage(() -> new Participants(readNames()));
        final Height height = retryOnRuntimeExceptionWithMessage(() -> new Height(inputView.readHeight()));

        final Ladder ladder = new Ladder(participants, height, booleanGenerator);

        final List<Line> lines = ladder.getLines();
        outputView.printResult(ladderFormGenerator.generate(participants, lines));
    }

    private List<Name> readNames() {
        return inputView.readNames()
                .stream()
                .map(Name::new)
                .collect(Collectors.toList());
    }
}
