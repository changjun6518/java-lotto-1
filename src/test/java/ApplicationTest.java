import domain.Amount;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    public void 금액_입력받기() throws Exception{
        String inputMoney = "1000";
        Amount amount = new Amount(inputMoney);


    }
}