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

    public void compare(List<Integer> winningNumbers) {
        int count = 0;
        for (Integer winningNumber : winningNumbers) {
            if (numbers.contains(winningNumber)) {
                count++;
            }
        }
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
