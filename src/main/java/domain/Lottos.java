package domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private List<Lotto> lottos = new ArrayList<>();

    public Lottos() {
    }

    public void generate(int count) {
        for (int i = 0; i < count; i++) {
            lottos.add(new Lotto());
        }
    }
}
