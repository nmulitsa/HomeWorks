import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(8);
        System.out.println(a);

        int day = a;
        if(day == 1) {
            System.out.println("понедельник");
        } else if(day == 2) {
            System.out.println("вторник");
        } else  if(day == 3) {
            System.out.println("среда");
        } else if(day == 4) {
            System.out.println("четверг");
        } else if(day == 5) {
            System.out.println("пятница");
        } else if(day == 6) {
            System.out.println("суббота");
        } else if(day == 7) {
            System.out.println("воскресенье");
        }
        else {
            System.out.println("такого дня нет");

            }
        }
    }
