import domain.*;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    public void 금액_입력받기() throws Exception{
        String inputMoney = "1000";
        Amount amount = new Amount(inputMoney);


    }

    @Test
    void generateLotto() {
        Lottos lottos = new Lottos();
        Lotto lotto = new Lotto();
        lottos.generate(3); // 금액만큼
    }

    @Test
    void compareNumbers() {
        Lotto lotto = new Lotto();
        WinningNumber winningNumber = new WinningNumber("1, 2, 3, 4, 5, 6");
        winningNumber.compare(lotto);

    }
}