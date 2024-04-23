import java.text.MessageFormat;

public class Twofer {
    public String twofer(String name) {
	String who = name == null ? "you" : name;
	return MessageFormat.format("One for {0}, one for me.", who);
    }
}
