package org.example.J15;

import static org.example.J15.MyLogger.getMyLoggerInstance;

public class Exe {
    public static void execute() {
        MyLogger logger1 = getMyLoggerInstance();
        logger1.log("first");
        MyLogger logger2 = getMyLoggerInstance();
        logger2.log("second");
    }
}
