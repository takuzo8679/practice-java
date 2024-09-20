package J6;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Exe {
    public static void execute() {
        try(
                FileInputStream fis = new FileInputStream("input.dat");
                FileOutputStream fos = new FileOutputStream("output.zip");
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                GZIPOutputStream gos = new GZIPOutputStream(bos);
        ){
            gos.write(bis.readAllBytes());
            gos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
