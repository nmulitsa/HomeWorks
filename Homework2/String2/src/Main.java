import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите что-нибудь: ");
        String str = scanner.nextLine();
        if (str.length()<=0) {
            System.out.println("Вы ничего не написали, перезапустите программу.");
        }
        System.out.println();
        System.out.println("Введите символ заменяемый символ:");
        String a = scanner.nextLine();
        System.out.println("Введите символ заменяющий символ:");
        String b = scanner.nextLine();


        System.out.print(str.replace(a, b));

    }
}