import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class HighScores {
    final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
	this.highScores = highScores;
    }

    List<Integer> scores() {
	return highScores;
    }

    Integer latest() {
	return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
	return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
	return highScores.stream()
	    .sorted((v1, v2) -> v2.compareTo(v1))
	    .limit(3)
	    .collect(Collectors.toList());
    }
}
