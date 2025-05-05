package decorator.models;

import decorator.abstracts.ALoggerDecorator;
import decorator.enums.LogLevel;
import decorator.interfaces.ILogger;

public class LevelLogger extends ALoggerDecorator {
    private final LogLevel level;
    public LevelLogger(ILogger logger, LogLevel level) {
        super(logger);
        this.level = level;
    }

    @Override
    public void log(String mesaj) {
        super.log("[" + level + "] " + mesaj);
    }
}
