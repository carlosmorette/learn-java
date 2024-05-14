import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class Say {
    private final Map<Long, String> numbers = new HashMap<Long, String>() {{
        put(0L, "zero");
        put(1L, "one");
        put(2L, "two");
        put(3L, "three");
        put(4L, "four");
        put(5L, "five");
        put(6L, "six");
        put(7L, "seven");
        put(8L, "eight");
        put(9L, "nine");
        put(10L, "ten");
        put(11L, "eleven");
        put(12L, "twelve");
        put(13L, "thirteen");
        put(14L, "fourteen");
        put(15L, "fifteen");
        put(16L, "sixteen");
        put(17L, "seventeen");
        put(18L, "eighteen");
        put(19L, "nineteen");
        put(20L, "twenty");
        put(30L, "thirty");
        put(40L, "forty");
        put(50L, "fifty");
        put(60L, "sixty");
        put(70L, "seventy");
        put(80L, "eighty");
        put(90L, "ninety");
        put(100L, "hundred");
        put(1000L, "thousand");
        put(1000_000L, "million");
        put(1000_000_000L, "billion");
    }};

    public String say(long number) {
        if (number < 10) {
            return numbers.get(number);
        } else if (number < 20) {
            var str = String.valueOf(number);
            long second = Long.valueOf(str.substring(1, str.length()));
            return MessageFormat.format("{0}teen", numbers.get(second));
        } else if (number < 100) {
            long toGet = (long) (number / 10) * 10;
            var str = String.valueOf(number);
            long rest = Long.valueOf(str.substring(1, str.length()));
            String restStr = rest == 0 ? "" : "-" + say(rest);
            return MessageFormat.format("{0}{1}", numbers.get(toGet), restStr);
        } else if (number < 1000) {
            
        }

        return "";
    }
}
