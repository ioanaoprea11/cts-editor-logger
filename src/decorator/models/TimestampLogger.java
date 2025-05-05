package decorator.models;

import decorator.abstracts.ALoggerDecorator;
import decorator.interfaces.ILogger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampLogger extends ALoggerDecorator {
    public TimestampLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String mesaj) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        super.log("[" + timestamp + "] " + mesaj);
    }
}
