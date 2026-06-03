public class LogLevels {

    public static String message(String logLine) {
        return logLine.split(": ")[1].strip();
    }

    public static String logLevel(String logLine) {
        String levelRaw = logLine.split(": ")[0];

        return levelRaw.substring(1, levelRaw.length() - 1).toLowerCase().strip();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
