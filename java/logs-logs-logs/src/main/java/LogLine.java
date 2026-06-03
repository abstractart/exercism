public class LogLine {
    String[] logLine;

    public LogLine(String logLine) {
        this.logLine = logLine.split("]: ");
    }

    public LogLevel getLogLevel() {
        return this.getLogLevelFromString(logLine[0].substring(1));
    }

    public String getOutputForShortLog() {
        return getLogLevel().getShort() + ":" + this.logLine[1];
    }

    private LogLevel getLogLevelFromString(String logLevelRaw) {
        return switch (logLevelRaw) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }
}
