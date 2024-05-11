import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class IsogramChecker {
    List<String> ALPHABET_LETTERS = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

    boolean isIsogram(String phrase) {
	List<String> accumulator = new ArrayList<String>();
	boolean is = true;
	var listPhrase = phrase.toLowerCase().split("");

	for(String s: listPhrase) {
	    if (accumulator.contains(s) && ALPHABET_LETTERS.contains(s)) {
		return false;
	    }
	    
	    accumulator.add(s);
        }

	return true;
    }
}
