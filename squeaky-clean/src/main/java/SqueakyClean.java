class SqueakyClean {
    static String clean(String identifier) {
	String my = new String(identifier);
	return replaceArentLetter(removeEmpty(kebabToCamelCase(translate(my))));
    }

    private static String removeEmpty(String identifier) {
	return identifier.replace(" ", "_");
    }

    static String replaceArentLetter(String identifier) {
	return identifier.replaceAll("[^a-zA-Z|\\_]", "");
    }

    private static String kebabToCamelCase(String identifier) {
	StringBuffer newIdentifier = new StringBuffer("");
	boolean nextShouldUp = false;
	
	for(char c: identifier.toCharArray()) {
	    if(c == '-') {
		nextShouldUp = true;
	    } else if (nextShouldUp) {
		newIdentifier.append(Character.toString(c).toUpperCase());
		nextShouldUp = false;
	    } else {
		newIdentifier.append(Character.toString(c));
	    }
	}

	return newIdentifier.toString();
    }

    static String translate(String identifier) {
	StringBuffer newIdentifier = new StringBuffer("");

	for (char c: identifier.toCharArray()) {
	    newIdentifier.append(switchTranslate(c));
	}

	return newIdentifier.toString();
    }

    static String switchTranslate(Character c) {
	switch(c) {
	case '3':
	    return "e";
	case '0':
	    return "o";
	case '1':
	    return "l";
	case '4':
	    return "a";
	case '7':
	    return "t";
	default:
	    return c.toString();
	}
    }
}
