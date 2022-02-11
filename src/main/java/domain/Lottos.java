package domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private List<Lotto> lottos = new ArrayList<>();

    public Lottos(Amount amount) {
        generate(amount);
    }

    public List<Reward> compare(WinningNumber winningNumber) {
        List<Reward> rewards = new ArrayList<>();
        for (Lotto lotto : lottos) {
            Reward reward = winningNumber.compare(lotto);
            rewards.add(reward);
        }
        return rewards;
    }

    private void generate(Amount amount) {
        for (int i = 0; i < amount.countCanBuy(); i++) {
            lottos.add(new Lotto());
        }
    }
}
