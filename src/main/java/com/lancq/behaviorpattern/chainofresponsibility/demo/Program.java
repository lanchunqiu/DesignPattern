package com.lancq.behaviorpattern.chainofresponsibility.demo;

/**
 * 客户端
 *
 * @author lancq
 */
public class Program {
    public static void main(String[] args) {
        Logger logger, logger1, logger2;
        logger = new ConsoleLogger(LogLevel.DEBUG);
        logger1 = logger.setNext(new EmailLogger(LogLevel.WARNING));
        logger2 = logger1.setNext(new FileLogger(LogLevel.ERROR));

        logger.message("Entering function ProcessOrder().", LogLevel.DEBUG);
        logger.message("Customer Address details missing in Branch DataBase.", LogLevel.WARNING);
        logger.message("Customer Address details missing in Organization DataBase.", LogLevel.ERROR);

    }
}
