package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    public static final Integer MAX = 45;
    public static final Integer MIN = 1;
    public static final Integer SIZE = 6;

    private List<Integer> numbers = new ArrayList<>();

    public Lotto() {
        generate();
    }

    public Reward compare(List<Integer> winningNumbers, Integer bonus) {
        int count = 0;
        boolean bonusHit = false;
        for (Integer winningNumber : winningNumbers) {
            if (numbers.contains(winningNumber)) {
                count++;
            }
        }
        if (numbers.contains(bonus)) {
            bonusHit = true;
        }
        return Reward.of(count, bonusHit);
    }

    private void generate() {
        while (numbers.size() != SIZE) {
            addRandomNumberNotDuplicate();
        }
    }

    private void addRandomNumberNotDuplicate() {
        int randomNumber = (int) (Math.random() * (MAX - MIN)) + MIN;
        if (!numbers.contains(randomNumber)) {
            numbers.add(randomNumber);
        }
    }

}
