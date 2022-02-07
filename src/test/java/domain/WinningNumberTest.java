package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinningNumberTest {
    @Test
    public void correct_test() throws Exception{
        Assertions.assertDoesNotThrow(
                () -> new WinningNumber("1, 2, 3, 4, 5, 6")
        );;
    }

    @Test
    public void pattern_test() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("1,2,3,4,5,6")
        );
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("a, b, c, d, e, f")
        );
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("")
        );
    }

    @Test
    public void duplicate_test() throws Exception{
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("1, 1, 2, 3, 4, 5")
        );
    }

    @Test
    public void bonus_duplicate_test() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("1, 2, 3, 4, 5, 6", 1)
        );
    }

    @Test
    public void not_correct_test() throws Exception{
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("0, 100, 222, 333, 444, 55")
        );
    }

    @Test
    public void not_valid_bonusNumber_test() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new WinningNumber("1, 2, 3, 4, 5, 6", 0));
    }
}