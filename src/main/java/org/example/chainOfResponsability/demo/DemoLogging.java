package org.example.chainOfResponsability.demo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogging {
    public static final Logger logger = Logger.getLogger(DemoLogging.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging");
        logger.finest("Finer level, but not as fine as finest");
        logger.finest("Fine, but not as fine as finer or finest");

    }
}
