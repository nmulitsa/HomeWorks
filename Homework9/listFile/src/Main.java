import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File[] files;
        File f = new File("c:\\Projects\\HomeWorks\\Homework9\\listFile\\HW\\");
        files = f.listFiles();

        File res = new File("c:\\Projects\\HomeWorks\\Homework9\\listFile\\HW\\result.txt");
        res.createNewFile();
        FileOutputStream r = new FileOutputStream(res);

        for (int i = 0; i < files.length; i++) {
            FileInputStream f1 = new FileInputStream(files[i]);
            byte[] buffer = new byte[f1.available()];
            f1.read(buffer, 0, buffer.length);
            r.write(buffer, 0, buffer.length);
        }
    }
}