import domain.Amount;
import domain.Lotto;
import domain.LottoList;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    public void 금액_입력받기() throws Exception{
        String inputMoney = "1000";
        Amount amount = new Amount(inputMoney);


    }


    @Test
    void generateLotto() {
        LottoList lottoList = new LottoList();
        Lotto lotto = new Lotto();
        lottoList.generate(3); // 금액만큼
        lotto.generate();
    }
}