package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {
    @Test
    public void generateSixNumber() throws Exception{
        Lotto lotto = new Lotto();

        lotto.generate();


    }

}