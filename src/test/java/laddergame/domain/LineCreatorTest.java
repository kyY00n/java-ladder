package laddergame.domain;

import laddergame.TestDummy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static laddergame.TestDummy.*;
import static org.assertj.core.api.Assertions.*;

class LineCreatorTest {

    @Test
    void throwExceptionWhenBooleanGeneratorIsNull() {
        final BooleanGenerator generator = null;
        assertThatThrownBy(() -> new LineCreator(generator));
    }

    @Test
    void throwExceptionWhenWidthIsNotPositive() {
        assertThatThrownBy(() -> TEST_LINE_CREATOR.createLines(0, 1))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenHeightIsNotPositive() {
        assertThatThrownBy(() -> TEST_LINE_CREATOR.createLines(1, 0))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void returnsLinesSizeIsHeight() {
        final List<Line> lines = TEST_LINE_CREATOR.createLines(3, 2);
        assertThat(lines).hasSize(2);
    }
}