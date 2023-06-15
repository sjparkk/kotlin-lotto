# kotlin-lotto

## 로또(자동)

### 기능 목록
- [x] 1 ~ 45 까지의 로또 번호에서 랜덤한 숫자 하나를 뽑을 수 있다.
- [ ] 총 6개의 숫자로 이루어진 로또를 발급 받을 수 있다.
- [ ] 구입 금액 만큼 로또를 발급할 수 있다. 발급의 기준은 1장 당 1000원
- [ ] 당첨 번호와 발급한 로또 번호를 비교하여 갯수별로(3개~6개) 당첨 개수를 산정할 수 있다.
- [ ] 산정 된 당첨 정보를 통해 구입한 금액과의 수일률을 구할 수 있다.

### 기능 요구 사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 힌트
- 로또 자동 생성은 shuffled()을 활용한다.
- sorted()를 활용해 정렬 가능하다.
- contains()를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.

### 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

## 문자열 덧셈 계산기

### 기능 목록
- [x] 쉼표 또는 콜론을 구분자로 가지는 문자열을 전달 받아 구분자를 기준으로 분리 후 반환한다.
- [x] 분리 된 리스트의 각 숫자의 합을 구한다.
- [x] 빈 문자열 또는 null 을 입력할 경우 0을 반환 한다.
- [x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
- [x] 음수 하나만을 전달할 경우 RuntimeException 예외가 발생한다.
- [x] 전달할 문자열 내 음수가 포함되어 있는 경우 RuntimeException 예외가 발생한다.
- [x] 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자 구한다.
- [x] 커스텀 구분자가 있을 시 동일하게 구분자로서의 숫자 분리 후 합을 반환한다. 

### 기능 요구 사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### 프로그래밍 요구 사항
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.