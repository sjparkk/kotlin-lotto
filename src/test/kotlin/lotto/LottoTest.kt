package lotto

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoTest {

    @Test
    fun `1 ~ 45 까지의 로또 번호에서 랜덤한 숫자 하나를 뽑을 수 있다`() {
        val actual = LottoNumber().getLottoNumber()
        assertThat(actual).isBetween(1, 45)
    }

    @Test
    fun `1000원으로 한개의 로또를 발급 받을 수 있다`() {
        val actual = Lotto().buyLotto(1000)
        assertThat(actual.size).isEqualTo(1)
    }

    @Test
    fun `한 개의 로또는 총 6개의 숫자로 이루어져 있다`() {
        val actual = Lotto().buyLotto(1000)
        assertThat(actual[0].size).isEqualTo(6)
    }

    @Test
    fun `발급 받은 6개의 숫자 중 중복 된 숫자는 있을 수 없다`() {
        val lotto = Lotto().buyLotto(1000)
        val actual = lotto[0].toSet()
        assertThat(actual.size).isEqualTo(6)
    }

    @ParameterizedTest
    @ValueSource(ints = [14000, 10000, 5000])
    fun `구입 금액 만큼 로또를 발급할 수 있다 발급의 기준은 1장 당 1000원`(money: Int) {
        val actual = Lotto().buyLotto(money)
        assertThat(actual.size).isEqualTo(money/1000)
    }
}
