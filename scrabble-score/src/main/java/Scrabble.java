import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Scrabble {
    private String word;

    private Map<String, Integer> letters = new HashMap<String, Integer>() {
        {
            put("a", 1);
            put("e", 1);
            put("i", 1);
            put("o", 1);
            put("u", 1);
            put("l", 1);
            put("n", 1);
            put("r", 1);
            put("s", 1);
            put("t", 1);
            put("d", 2);
            put("g", 2);
            put("b", 3);
            put("c", 3);
            put("m", 3);
            put("p", 3);
            put("f", 4);
            put("h", 4);
            put("v", 4);
            put("w", 4);
            put("y", 4);
            put("k", 5);
            put("j", 8);
            put("x", 8);
            put("q", 10);
            put("z", 10);
        }
    };

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        return Arrays.asList(word.toLowerCase().split(""))
                .stream()
                .map(i -> letters.get(i))
                .reduce(0, (i, acc) -> acc == null ? 0 : i + acc);
    }

}
