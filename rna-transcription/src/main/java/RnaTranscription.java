import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Arrays;

class RnaTranscription {
    private Map<String, String> lettersWithTranslation = new HashMap<String, String>() {{
	    put("C", "G");
	    put("G", "C");
	    put("T", "A");
	    put("A", "U");
	}};

    String transcribe(String dnaStrand) {
	if (dnaStrand == "") {
	    return "";
	}

	return Arrays.asList(dnaStrand.split(""))
	    .stream()
	    .map(l -> lettersWithTranslation.get(l))
	    .reduce("", (i, acc) -> i + acc);
	}

}
