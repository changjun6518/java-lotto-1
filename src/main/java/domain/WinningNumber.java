package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningNumber {
    private List<Integer> numbers;
    private Integer bonus;

    public WinningNumber(String numbers, Integer bonus) {
        isValidPattern(numbers);
        this.numbers = convertStringToIntegerList(numbers);
        this.bonus = bonus;
        isValidDuplicate(bonus);
        isValidNumbers();
        isValidRange(bonus);
    }

    public WinningNumber(String numbers) {
        isValidPattern(numbers);
        this.numbers = convertStringToIntegerList(numbers);
        isValidNumbers();
        isValidDuplicate();
    }

    public Reward compare(Lotto lotto) {
        return lotto.compare(numbers, bonus);
    }

    private void isValidPattern(String input) {
        boolean matches = Pattern.matches("[0-9]+, [0-9]+, [0-9]+, [0-9]+, [0-9]+, [0-9]+", input);
        if (!matches) {
            throw new IllegalArgumentException("당첨번호를 잘 입력해주세요 (ex. 1, 10, 15, 32, 45, 42)");
        }
    }

    private void isValidNumbers() {
        for (Integer number : numbers) {
            isValidRange(number);
        }
    }

    private void isValidRange(Integer number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("1부터 45 사이의 수를 입력하세요");
        }
    }

    private void isValidDuplicate() {
        HashSet<Integer> hashSet = new HashSet<>(numbers);
        if (hashSet.size() != 6) {
            throw new IllegalArgumentException("중복된 숫자가 있습니다");
        }
    }

    private void isValidDuplicate(Integer bonus) {
        HashSet<Integer> hashSet = new HashSet<>(numbers);
        hashSet.add(bonus);
        if (hashSet.size() != 7) {
            throw new IllegalArgumentException("중복된 숫자가 있습니다");
        }
    }

    private List<Integer> convertStringToIntegerList(String input) {
        return Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
