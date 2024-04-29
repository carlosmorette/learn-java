import java.util.HashMap;
import java.text.MessageFormat;
import java.util.Map;

class ResistorColorTrio {
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
    
    String label(String[] iColors) {
	var first = iColors[0];
	var second = iColors[1]; 
	var third = iColors[2];

	return MessageFormat.format(
				    "{0}{1} {2}",
				    firstTwo(first, second),
				    thirdNumber(third),
				    label(third)
				    );
    }

    String firstTwo(String first, String second) {
	if (first == "black" && second == "black") {
	    return "0";
	}

	return maybeShow(first) + maybeShow(second);
    }

    String maybeShow(String color) {
	var colorN = colors.get(color);
	return colorN == 0 ? "" : String.valueOf(colorN);
    }

    String thirdNumber(String color) {
	Integer converted = colors.get(color);
	if (converted == 1) {
	    return "0";
	} else if (converted == 0) {
	    return "";
	} else if (converted == 4) {
	    return "0";
	}
	// } else if (converted >= 2 && converted <= 4) {
	//     return "0";
	// } else if (converted == 6) {
	//     return "0";
	// }

	return "";
    }

    String label(String color) {
	Integer converted = colors.get(color);
	if (converted == 0 || converted == 1) {
	    return "ohms";
	} else if (converted >= 2 && converted <= 4) {
	    return "kiloohms";
	} else if (converted == 6) {
	    return "megaohms";
	}

	return "gigaohms";
    }
}
