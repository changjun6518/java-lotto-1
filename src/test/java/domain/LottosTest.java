package domain;

import org.junit.jupiter.api.Test;

class LottosTest {
    @Test
    public void generateLottos() throws Exception{
        Lottos lottos = new Lottos();
        lottos.generate(5);

    }
}