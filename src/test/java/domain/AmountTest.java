package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountTest {
    @DisplayName("단위 테스트")
    @Test
    public void thousand_unit_test() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Amount("100"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Amount("1001"));
    }

    @DisplayName("숫자 테스트")
    @Test
    public void digit_test() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Amount("100a"));
    }

    @DisplayName("공백 테스트")
    @Test
    public void blank_test() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Amount(""));
    }

    @DisplayName("타입 변경에 따른 테스트")
    @Test
    public void string_to_integer() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Amount(100));
    }
}