import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("File1.txt"))) {

            String a;
            StringBuilder sb = new StringBuilder();
            while ((a = reader.readLine()) != null) {
                sb.append(a);
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println("Файл не существует");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("File2.txt"))) {

            String b;
            StringBuilder sb1 = new StringBuilder();
            while ((b = reader.readLine()) != null){
                sb1.append(b);
            }
            System.out.println(sb1.toString());
        } catch (IOException e) {
            System.out.println("Файл не существует");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("result.txt"))) {

            String c;
            StringBuilder sb2 = new StringBuilder();
            while ((c = reader.readLine()) != null){
                sb2.append(c);
            }
            System.out.println(sb2.toString());
        } catch (IOException e) {
            System.out.println("Файл не существует");
        }
        String text= s;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            writer.write();
            writer.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}