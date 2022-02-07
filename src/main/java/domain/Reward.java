package domain;

import java.util.Arrays;

public enum Reward {
    FIRST("6개 일치 (2000000000원)", 2_000_000_000, false, 6),
    SECOND("5개 일치, 보너스 볼 일치 (30000000원)", 30_000_000, true, 5),
    THIRD("5개 일치 (1500000원)", 1_500_000, false, 5),
    FOURTH("4개 일치 (50000원)", 50_000, false, 4),
    FIFTH("3개 일치 (5000원)", 5_000, false, 3),
    SIXTH("2개 일치 (3000원)", 3_000, false, 2),
    SEVENTH("1개 일치 (1000원)", 1_000, false, 1),
    FAIL("아쉽지만 다음 기회에...", 0, false, 0),
    ;

    private String message;
    private Integer price;
    private Boolean bonus;
    private Integer count;


    Reward(String message, Integer price, Boolean bonus, Integer count) {
        this.message = message;
        this.price = price;
        this.bonus = bonus;
        this.count = count;
    }

    Reward(String message, Integer price, Integer count) {
        this.message = message;
        this.price = price;
        this.count = count;
    }

    public static Reward of(int count) {
        return Arrays.stream(values())
                .filter(reward -> reward.isSameCount(count))
                .findAny()
                .orElse(FAIL);
    }

    public static Reward of(int count, boolean bonusHit) {
        return Arrays.stream(values())
                .filter(reward -> reward.isSameCount(count))
                .filter(reward -> reward.isBonusHit(bonusHit))
                .findAny()
                .orElse(FAIL);
    }

    public double calculateProfitRate(int amount) {
        return (double) price / amount;
    }

    private boolean isSameCount(int count) {
        return this.count == count;
    }

    private boolean isBonusHit(boolean bonusHit) {
        return this.bonus == bonusHit;
    }

    public String getMessage() {
        return message;
    }
}
