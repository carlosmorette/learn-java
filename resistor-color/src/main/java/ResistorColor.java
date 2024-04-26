import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class ResistorColor {
    private Map<String, Integer> colors = new HashMap<String, Integer>() {{
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

    int colorCode(String color) {
	return colors.get(color);
    }

    String[] colors() {
	return colors.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue())
	    .map(x -> x.getKey())
	    .collect(Collectors.toList())
	    .toArray(new String[colors.size()]);
    }
}
