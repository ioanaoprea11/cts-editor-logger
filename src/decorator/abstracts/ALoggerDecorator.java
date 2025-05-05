package decorator.abstracts;

import decorator.interfaces.ILogger;

public abstract class ALoggerDecorator implements ILogger {
    protected ILogger logger;

    public ALoggerDecorator(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String mesaj) {
        logger.log(mesaj);
    }
}
