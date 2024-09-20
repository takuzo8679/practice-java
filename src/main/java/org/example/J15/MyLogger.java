package org.example.J15;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    private static MyLogger theInstance;
    private FileWriter fw = null;

    private MyLogger() {
        try {
            fw = new FileWriter("dummy.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static MyLogger getMyLoggerInstance() {
        if (theInstance == null) {
            theInstance = new MyLogger();
        }
        return theInstance;
    }

    public void log(String log){
        if (fw == null) return;
        try{
            fw.write(log);
            fw.flush();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
