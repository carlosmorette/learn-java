public class LogLevels {
    
    public static String message(String logLine) {
	return logLine.replaceAll("\\[.*\\]\\:", "").trim();
    }

    public static String logLevel(String logLine) {
	if (logLine.startsWith("[ERROR]")) {
	    return "error";
	} else if (logLine.startsWith("[WARNING]")) {
	    return "warning";
	}

	return "info";
    }

    public static String reformat(String logLine) {
	String message = message(logLine);
	String logLevel = logLevel(logLine);
	return String.format("%s (%s)",  message, logLevel);
    }
}
