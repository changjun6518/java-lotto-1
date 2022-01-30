package controller;

import domain.Amount;
import domain.Lottos;
import domain.Result;
import domain.WinningNumber;
import view.InputView;
import view.OutputView;

public class Controller {

    public void run() {
        Amount amount = new Amount(InputView.getUserMoney());
        Lottos lottos = new Lottos(amount);
        WinningNumber winningNumber = new WinningNumber(InputView.getWinningNumber());
        Result result = new Result(lottos, winningNumber);
        OutputView.printProfitResult(result, amount);
    }

}
