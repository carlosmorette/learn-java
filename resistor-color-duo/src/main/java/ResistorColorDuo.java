import java.util.Map;
import java.util.HashMap;

class ResistorColorDuo {
    private Map<String, Integer> mapColors = new HashMap<String, Integer>() {{
	    put("black", 0);
	    put("brown", 1);
	    put("red", 2);
	    put("orange", 3);
	    put("yellow", 4);
	    put("green", 5);
	    put("blue", 6);
	    put("violet", 7);
	    put("grey", 8);
	    put("white", 9);
	}};
    
    int value(String[] colors) {
	String acc = "";
	for(String c: colors) {
	    if (acc.length() == 2) {
		return Integer.valueOf(acc);
	    }

	    acc = acc + mapColors.get(c);
	}

	return Integer.valueOf(acc);
    }
}
