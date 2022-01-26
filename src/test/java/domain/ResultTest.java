package domain;

import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    @Test
    public void compareLottoNumberAndWinningNumber() throws Exception {
        Amount amount = new Amount("1000");
        Lottos lottos = new Lottos(amount);
        WinningNumber winningNumber = new WinningNumber("1, 2, 3, 4, 5, 6");

        Result result = new Result(lottos, winningNumber);
        Double profit = result.returnProfit(amount);
        System.out.println("profit = " + profit);
        assertTrue(profit >= 0);
    }

}