package rikkei.academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {
    public static void main(String[] args) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try {
            File infile = new File("C:\\Users\\Asus\\Module2\\bai16\\Bai16-BT1-copy-file-text\\src\rikkei\\academy\\file.txt");
            File outfile = new File("C:\\Users\\Asus\\Module2\\bai16\\Bai16-BT1-copy-file-text\\src\\rikkei\\academy\\copyFile.txt");

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, length);
            }

            instream.close();
            outstream.close();
            System.out.println("Copy thành công!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}