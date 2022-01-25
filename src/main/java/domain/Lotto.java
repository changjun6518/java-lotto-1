package domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    private List<Integer> numbers = new ArrayList<>();

    public Lotto() {
    }

    public void generate() {
        while (numbers.size() != 6) {
            addRandomNumberNotDuplicate();
        }
    }

    private void addRandomNumberNotDuplicate() {
        int randomNumber = (int) (Math.random() * (45 - 1)) + 1;
        if (!numbers.contains(randomNumber)) {
            numbers.add(randomNumber);
        }
    }
}
