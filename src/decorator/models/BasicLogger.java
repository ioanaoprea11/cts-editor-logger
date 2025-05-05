package decorator.models;

import decorator.interfaces.ILogger;

public class BasicLogger implements ILogger {
    @Override
    public void log(String mesaj) {
        System.out.println("ERROR: " + mesaj);
    }
}
