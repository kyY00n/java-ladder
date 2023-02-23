# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 페어

| <img src="https://avatars.githubusercontent.com/u/61582017?v=4" alt="" width=200> | <img src="https://avatars.githubusercontent.com/u/82203978?v=4" alt="" width=200/> |
|:---------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------:|
|                          [로지](https://github.com/kyY00n)                          |                         [헤나](https://github.com/hyena0608)                         | |

## 규칙

- 20분 마다 페어는 번걸아가면서 진행한다.
- 집중력이 흐트러진 팀원이 먼저 휴식을 제안한다.
- 코드에 대한 지적이 내 인격에 대한 지적이 아니란 걸 잊지 않는다.
- 상대방의 말을 끝까지 듣고 존중해준다.
- 혹시 페어가 마음이 상할까 봐 하고 싶은 말을 숨기지 않는다.

## 기능 요구사항

- [x] 사다리 폭은 모든 이름보다 길다.
- [x] 사다리의 모든 가로 라인이 겹치지 않는다.
- [x] 사다리의 모든 높이마다 가로 라인이 1개 이상 있어야한다.

## 기능 목록

- [x] 입력은 5회까지 가능하다.
- [x] 사람들의 이름을 입력받는다.
    - [x] 사람 이름은 쉼표를 기준으로 구분한다.
    - [x] 사람 이름은 중복되지 않는다.
    - 사람이 두 명 이상이 아닐경우
        - [x] 예외를 발생하고
        - [x] 다시 입력을 받는다.
- [x] 사다리 결과들을 입력받는다.
    - 인원수과 결과의 개수가 일치하지 않을 경우
        - [x] 예외를 발생한다.
        - [x] 다시 입력을 받는다.
- [x] 최대 사다리 높이 개수를 입력받는다.
- [x] 사다리 결과를 출력한다.
    - [x] 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사다리 실행 결과를 출력한다.
    - [x] 결과를 보고 싶은 사람의 이름을 입력받는다.
        - 참여자에 존재하지 않는 이름일 경우
            - [x] 예외를 발생한다.
            - [x] 다시 입력받는다.
    - 특정 참여자의 결과를 출력할 수 있다.
        - [x] 해당하는 사람의 결과를 출력한다.
    - 참가자 모두의 결과를 출력할 수 있다.
        - [x] 참가자 모두의 이름과 결과를 출력할 수 있다.

## 구현 요구사항

- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 배열 대신 컬렉션을 사용한다.
- Java Enum을 적용한다.
- 모든 원시 값과 문자열을 포장한다
- 줄여 쓰지 않는다(축약 금지).
- 일급 컬렉션을 쓴다.
