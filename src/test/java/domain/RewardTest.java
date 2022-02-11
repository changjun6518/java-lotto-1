package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RewardTest {
    @Test
    public void countTest() throws Exception {
        assertEquals(Reward.FAIL, Reward.of(0));
        assertEquals(Reward.FAIL, Reward.of(1));
        assertEquals(Reward.FAIL, Reward.of(2));
        assertEquals(Reward.FOURTH, Reward.of(3));
        assertEquals(Reward.THIRD, Reward.of(4));
        assertEquals(Reward.SECOND, Reward.of(5));
        assertEquals(Reward.FIRST, Reward.of(6));
    }
}