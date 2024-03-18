import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream f1 =new FileInputStream("file1.txt");
            FileInputStream f2 =new FileInputStream("file2.txt");
            FileOutputStream r = new FileOutputStream("result.txt")){
            byte[] buffer = new byte[f1.available()];
            byte[] buffer1 = new byte[f2.available()];
            f1.read(buffer, 0, buffer.length);
            f2.read(buffer1, 0, buffer1.length);
            r.write(buffer,0,buffer.length);
            r.write(buffer1,0,buffer1.length);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}