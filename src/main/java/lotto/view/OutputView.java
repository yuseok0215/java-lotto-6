package lotto.view;

import java.util.List;
import lotto.domain.Lotto;

public class OutputView {

    public static void announceLottoPurchaseQuantity(int purchaseQuantity) {
        System.out.println(purchaseQuantity + "개를 구매했습니다.");
    }

    public static void announceMultipleLottoNumbers(List<Lotto> lottoTickets) {
        for (Lotto lotto : lottoTickets) {
            System.out.println(lotto.getNumbers());
        }
    }
}
