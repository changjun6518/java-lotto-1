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
        Amount amount = new Amount("1000");
        Lottos lottos = new Lottos(amount);
        Lotto lotto = new Lotto();
    }

    @Test
    void compareNumbers() {
        Lotto lotto = new Lotto();
        WinningNumber winningNumber = new WinningNumber("1, 2, 3, 4, 5, 6");
        Reward reward = winningNumber.compare(lotto);
        reward.print();
    }


    @Test
    void calculateProfitRate() {
        Amount amount = new Amount("1000");
        Lotto lotto = new Lotto();
        WinningNumber winningNumber = new WinningNumber("1, 2, 3, 4, 5, 6");
        Reward reward = winningNumber.compare(lotto);

        double v = amount.calculateProfitRate(reward);
        System.out.println(v);
    }
}