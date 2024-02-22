import java.util.Random;

public class Main {
    public static void main(String[] args) {
                Random random = new Random();
                int a = random.nextInt(4) +1;
                double b = random.nextDouble();
                double c = random.nextDouble() + 0.0;

                System.out.println("Математическое действие " + a);
                System.out.println("A = " + b);
                System.out.println("B = " + c);

                int N = a;
                double A = b;
                double B = c;

                switch (N) {
                    case 1:
                        System.out.println("A + B = " + (A+B));
                        break;
                    case 2:
                        System.out.println("A - B = " + (B-A));
                        break;
                    case 3:
                        System.out.println("A * B = " + (B*A));
                        break;
                    default:
                        System.out.println("A / B = " + (B/A));
                        break;
                }
            }
        }