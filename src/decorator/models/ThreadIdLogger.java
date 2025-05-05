package decorator.models;

import decorator.abstracts.ALoggerDecorator;
import decorator.interfaces.ILogger;

public class ThreadIdLogger extends ALoggerDecorator {
    public ThreadIdLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String mesaj) {
        long threadId = Thread.currentThread().getId();
        super.log("[Thread-" + threadId + "] " + mesaj);
    }
}
