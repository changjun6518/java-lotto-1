package domain;

public class Amount {
    private Integer amount;

    public Amount(String amount) {
        isValidBlank(amount);
        isValidDigit(amount);
        isValidUnit(amount);
        this.amount = Integer.parseInt(amount);
    }

    private void isValidUnit(String amount) {
        int amountInt = Integer.parseInt(amount);
        if (amountInt % 1000 != 0 || amountInt < 1000) {
            throw new IllegalArgumentException("투입 금액의 최소 단위는 1000원 입니다");
        }
    }

    private void isValidDigit(String amount) {
        for (char c : amount.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("투입 금액을 제대로 입력해 주세요");
            }
        }
    }

    private void isValidBlank(String amount) {
        if (amount.length() == 0) {
            throw new IllegalArgumentException("트입 금액을 제대로 입력해 주세요");
        }
    }

    public double calculateProfitRate(Reward reward) {
        return reward.calculateProfitRate(amount);
    }
}
