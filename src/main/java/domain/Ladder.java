package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Position> ladder;

    public Ladder(int width, BooleanGenerator randomGenerator) {
        this.ladder = new ArrayList<>();
        generate(randomGenerator, width);
    }

    private void generate(BooleanGenerator randomGenerator, int width) {
        while (ladder.size() < width - 1) {
            ladder.addAll(requirement(randomGenerator));
        }
        if (ladder.size() != width) {
            ladder.add(Position.DOWN);
        }
    }

    private List<Position> requirement(BooleanGenerator randomGenerator) {
        if (randomGenerator.get()) {
            return List.of(Position.LEFT, Position.RIGHT);
        }
        return List.of(Position.DOWN);
    }

    public List<Position> getLadder() {
        return new ArrayList<>(ladder);
    }

    public int getMove(int total){
        return getLadder().get(total)
                .getMove();
    }
}
