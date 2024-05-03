import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    public boolean isPangram(String input) {
    	List<String> accumulator = new ArrayList<String>();
        var listInput = input.replaceAll("\\s|\\d|\\_|\"|\\.", "").toLowerCase().split("");

        for (String s: listInput) {
            if (!(accumulator.contains(s))) {
                accumulator.add(s);
            }
        }
	System.out.println(accumulator);
	return accumulator.size() == 26;
    }
}
