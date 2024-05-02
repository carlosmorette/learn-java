import java.util.Arrays;

class Acronym {
    String phrase;

    Acronym(String phrase) {
	this.phrase = phrase;
    }

    String get() {
	return Arrays.asList(phrase.split("\\s|\\-|\\_"))
	    .stream()
	    .filter(x -> !x.isEmpty())
	    .map(x -> x.substring(0, 1))
	    .reduce("", (l, acc) -> l + acc)
	    .toUpperCase()
	    .replace("_", "");
    }
}
