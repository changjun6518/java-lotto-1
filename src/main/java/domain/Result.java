package domain;

import java.util.ArrayList;
import java.util.List;

public class Result {
    List<Reward> rewards;

    public Result(Lottos lottos, WinningNumber winningNumber) {
        rewards = compare(lottos, winningNumber);

    }

    private List<Reward> compare(Lottos lottos, WinningNumber winningNumber) {
        return lottos.compare(winningNumber);
    }

    public Double returnProfit(Amount amount) {
        double profit = 0;
        for (Reward reward : rewards) {
            profit += amount.calculateProfitRate(reward);
        }
        return profit;
    }

    public int countReward(Reward reward) {
        return (int) rewards.stream()
                .filter(rewardResult -> rewardResult == reward)
                .count();
    }
}
