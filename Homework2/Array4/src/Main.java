import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 10;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
                System.out.println("Массив является строго возрастающей последовательностью");
                break;
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью");
                break;
            }
        }
    }
}