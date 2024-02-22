import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println("a=" + a);
        int b = random.nextInt(100);
        System.out.println("b=" + b);
        int c = random.nextInt(100);
        System.out.println("c=" + c);


        if (a < b && a < c) {
            System.out.println("b+c =" + " " + (b + c));
        } else if(b < a && b < c) {
            System.out.println("a+c =" + " " + (a + c));
        } else {
                System.out.println("a+b =" + " "  + (a + b));
            }
            }
        }