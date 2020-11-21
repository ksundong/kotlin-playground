# Kotlin Tutorial

## Introduction

### Hello World

[Source Code](introduction/helloworld/main.kt)

1. 코틀린 코드는 대부분 패키지에 정의됩니다. 패키지 정의는 선택적이며, 명시하지 않았을 경우 기본 패키지로 가게됩니다.
2. 코틀린 애플리케이션의 진입점은 `main` 함수입니다. 코틀린 1.3에서는 `main` 함수를 어떤 파라미터 없이도 정의할 수 있습니다. 리턴 타입을 명시하지 않으면, 함수가 아무것도 반환하지 않는다는 것을 의미합니다.
3. `println` 은 표준 출력으로 라인을 작성합니다. 암시적으로 임포트 되며, 세미콜론은 선택적입니다.(작성하지 않는 편입니다.)

코틀린 1.3 이전의 버전들은 `main` 함수가 반드시 `Array<String>` 파라미터를 가져야 합니다.

### Functions

[Source Code](introduction/)

#### Default Parameter Values and Named Arguments

1. `String` 타입을 인자로 받는 간단한 함수, `Unit`을 리턴합니다.(`Unit`이 아무것도 리턴하지 않음을 나타냄 자바의 `void` 같은 것이고 `Nothing`과 구분해야합니다.)
2. 기본 값을 갖는 선택적 파라미터를 갖는 함수도 만들 수 있습니다. 리턴 타입을 생략할 수 있고 이는 `Unit`을 나타냅니다.
3. 단일 표현식을 바로 리턴값으로 하는 함수를 만들 수도 있습니다. 리턴 타입은 추론됩니다.
4. 인자에 이름을 붙여서 함수를 호출할 수도 있고, 인자의 순서를 바꿀 수도 있습니다.
