import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    private final List<String> letters = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    
     List<String> printToList(char a) {
        List<String> rows = new ArrayList<>();
        int targetIndex = letters.indexOf(String.valueOf(a)) + 1;
        int counter = 0;

        while (counter != targetIndex) {
            rows.add(buildRow(String.valueOf(a), letters.get(counter)));
            counter++;
        }

        List<String> bottom = reverse(rows.subList(0, rows.size() - 1));
        rows.addAll(bottom);
        return rows;
     }

    String buildRow(String targetLetter, String currentLetter) {
        if (targetLetter == "A" && currentLetter == "A") {
            return targetLetter;
        } else {
            int lineLength = letters.indexOf(targetLetter) * 2 + 1;
            int padding = letters.indexOf(targetLetter) - letters.indexOf(currentLetter);
            String left = MessageFormat.format("{0}{1}", buildSpaces(padding), currentLetter);
            String right = new StringBuilder(left).reverse().toString();
            String center = buildSpaces(lineLength - (left.length() + right.length()));
            
            return currentLetter == "A" ? 
                MessageFormat.format("{0}{1}{2}", buildSpaces(padding), currentLetter, buildSpaces(padding)) : 
                MessageFormat.format("{0}{1}{2}", left, center, right);
        }
    }

    String buildSpaces(int n) {
        if (n <= 0) {
            return "";
        } else {
            return new String(new char[n]).replace("\0", " ");
        }
    }

    List<String> reverse(List<String> rows) {
        List<String> newList = new ArrayList<String>();

        for (String s: rows) {
            newList.add(0, s);
        }

        return newList;
    }
}
