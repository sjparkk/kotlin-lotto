import domain.lotto.Lottos
import domain.money.Money
import domain.statistics.WinningStatistics
import domain.store.LottoStore
import view.BuyingInputView
import view.BuyingResultView
import view.WinningNumbersInputView
import view.WinningStatisticsView

fun main() {
    val store = LottoStore(price = Money(1000))

    val buyingInput = BuyingInputView.receiveAmount()
    val lottos = Lottos(store.buyLottos(buyingInput.toMoney()))
    BuyingResultView.print(lottos)

    val winningNumbersInput = WinningNumbersInputView.receiveWinningNumbers()
    val statistics = WinningStatistics(winningNumbersInput.toLottoNumbers(), lottos)
    WinningStatisticsView.print(statistics, lottos, store.price)
}