import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class BracketChecker {
    String expression; 
    List<String> openBracket = Arrays.asList("(", "{", "[");
    List<String> closeBracket = Arrays.asList(")", "}", "]");

    BracketChecker(String expression) {
	this.expression = expression;
    }

    boolean areBracketsMatchedAndNestedCorrectly() {
	List<String> stack = new ArrayList<String>();
	var explList = expression.split("");

	for(String ex: explList) {
	    if (openBracket.contains(ex))  {
		stack.add(0, ex);
	    } else if (closeBracket.contains(ex) && stack.isEmpty()) {
		return false;
	    } else if(closeBracket.contains(ex)) {
		switch(ex) {
		case ")":
		    if (stack.get(0).equals("(")) {
			stack.remove(0);
		    } else {
			return false;
		    }
		    break;
		case "}":
		    if (stack.get(0).equals("{")) {
			stack.remove(0);
		    } else {
			return false;
		    }
		    break;
		case "]":
		    if (stack.get(0).equals("[")) {
			stack.remove(0);
		    } else {
			return false;
		    }
		    break;
		}
	    } 
	}

	return stack.isEmpty();
    }
}
