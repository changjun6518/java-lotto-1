package view;

import domain.Amount;
import domain.Result;
import domain.Reward;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class OutputView {
    public static void printProfitResult(Result result, Amount amount) {
        System.out.println("당첨 통계");
        System.out.println("----------");

        Arrays.stream(Reward.values())
                .filter(reward -> reward != Reward.FAIL)
                .forEach(reward -> printResult(result, reward));

        System.out.println("총 수익률은 " + result.returnProfit(amount) + "%");
    }

    private static void printResult(Result result, Reward reward) {
        System.out.println(reward.getMessage() + " - " + result.countReward(reward));
    }
}
