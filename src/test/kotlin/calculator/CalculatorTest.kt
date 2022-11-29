package calculator

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource

internal class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @DisplayName(value = "빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.")
    @ParameterizedTest
    @NullAndEmptySource
    fun emptyOrNull(text: String?) {
        assertThat(calculator.add(text)).isZero
    }

    @DisplayName(value = "숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.")
    @ParameterizedTest
    @ValueSource(strings = ["1"])
    fun oneNumber(text: String) {
        assertThat(calculator.add(text)).isSameAs(Integer.parseInt(text))
    }

    @DisplayName(value = "숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.")
    @ParameterizedTest
    @ValueSource(strings = ["1,2"])
    fun comma(text: String) {
        assertThat(calculator.add(text)).isSameAs(3)
    }

    @DisplayName(value = "구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다.")
    @ParameterizedTest
    @ValueSource(strings = ["1,2:3"])
    fun colon(text: String) {
        assertThat(calculator.add(text)).isSameAs(6)
    }

    @DisplayName(value = "//와 \n 문자 사이에 커스텀 구분자를 지정할 수 있다.")
    @ParameterizedTest
    @ValueSource(strings = ["//#\n1#2#3"])
    fun custom(text: String) {
        assertThat(calculator.add(text)).isSameAs(6)
    }

    @DisplayName(value = "음수를 전달할 경우 RuntimeException 예외가 발생해야 한다.")
    @ParameterizedTest
    @ValueSource(
        strings = ["-1", "1,2,-3"]
    )
    fun negativeNumber(text: String) {
        assertThatExceptionOfType(RuntimeException::class.java).isThrownBy {
            calculator.add(text)
        }
    }

    @DisplayName(value = "숫자 이외의 값을 전달할 경우 RuntimeException 예외가 발생해야 한다.")
    @ParameterizedTest
    @ValueSource(strings = ["a", "1,a,3", "1,2,a"])
    fun nonNumber(text: String) {
        assertThatExceptionOfType(RuntimeException::class.java).isThrownBy {
            calculator.add(text)
        }
    }
}