package view;

import domain.Amount;
import domain.Result;
import domain.Reward;

public class OutputView {
    public static void printProfitResult(Result result, Amount amount) {
        System.out.println("당첨 통계");
        System.out.println("----------");
        for (Reward reward : Reward.values()) {
            printRewardCount(result, reward);
        }
        System.out.println("총 수익률은 " + result.returnProfit(amount) + "%");
    }

    private static void printRewardCount(Result result, Reward reward) {
        if (reward != Reward.FAIL) {
            System.out.println(reward.getMessage() + " - " + result.countReward(reward));
        }
    }
}
