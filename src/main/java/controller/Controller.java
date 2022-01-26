package controller;

import domain.Amount;
import domain.Lottos;
import domain.Result;
import domain.WinningNumber;
import view.InputView;

public class Controller {

    public void run() {
        Amount amount = new Amount(InputView.getUserMoney());
        Lottos lottos = new Lottos(amount);
        WinningNumber winningNumber = new WinningNumber(InputView.getWinningNumber());
        Result result = new Result(lottos, winningNumber);
        Double profit = result.returnProfit(amount);
        System.out.println("수익률은 : " + profit);
    }

}
