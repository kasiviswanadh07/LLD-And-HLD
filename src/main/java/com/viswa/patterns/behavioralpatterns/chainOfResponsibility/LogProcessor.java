package com.viswa.patterns.behavioralpatterns.chainOfResponsibility;

public abstract class LogProcessor {
    public static final int DEBUG = 1;
    public static final int INFO = 1;
    public static final int ERROR = 1;
    public static final int FATAL = 1;
    int level;

    LogProcessor nextLoggerProcessor;

    public void setNextLogger(LogProcessor nextLogger) {
        this.nextLoggerProcessor = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        // Pass to next handler in chain if exists
        if (this.nextLoggerProcessor != null) {
            this.nextLoggerProcessor.logMessage(level, message);
        }

    }

    abstract protected void write(String message);

}
