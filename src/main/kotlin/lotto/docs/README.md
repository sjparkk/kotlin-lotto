# 로또

## 📋 기능 요구 사항

- [x] 구입 금액을 입력받고 구입금액만큼 로또를 발급한다
  - [x] 로또 1장의 가격은 천원이다. 천단위로 금액이 들어오는지 체크한다.
  - [x] 음수의 값이 들어오면 예외를 발생 시켜야 한다.
- [x] 지난 주 로또 번호를 입력 할 수 있다.
  - [x] 로또 번호의 개수는 6개다 6개가 아닐시 예외를 발생시킨다.
  - [x] 로또 번호 숫자가 아닐시 예외를 발생 시킨다.
  - [x] 로또 번호 범위를 초과할경우 예외를 발생 시킨다 1~45
- [x] 로또를 추첨 한다.
- [x] 2등을 위해 번호 하나 더 추첨한다.
- [x] 당 통계에 2등도 추가해야 한다.
- [x] 현재 로또 생성기는 자동 생성 기능만 지원한다. 수동으로 추첨 번호를 입력할 수 있도록 해야 한다.
- [x] 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.


## 🚀 프로그래밍 요구 사항

- 모든 로직에 단위 테스트를 구현한다. 단 UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView 와 같은 클래스로 추가해 분리한다.
- Indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메소드) 가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.
- 모든 원시값과 문자열을 포장한다.
- 예외 처리를 통해 에러가 발생하지 않도록 한다.

## ✨ 힌트
- 모든 원시값과 문자열을 포장한다.
  - 로또 숫자 하나는 Int다. 이 숫자 하나를 추상화한 LottoNumber를 추가해 구현한다.
- 예외 처리를 통해 에러가 발생하지 않도록 한다.
- 참고로 코틀린에서는 아래와 같이 예외 처리를 한다. 장기적으로는 아래와 같이 예외 처리하는 걸 연습해 본다.
- 논리적인 오류일 때만 예외를 던진다.
- 논리적인 오류가 아니면 예외를 던지지 말고 null을 반환한다.
- 실패하는 경우가 복잡해서 null로 처리할 수 없으면 sealed class를 반환한다.
- 일반적인 코틀린 코드에서 try-catch를 사용하지 않는다.