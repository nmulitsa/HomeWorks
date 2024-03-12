public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 56;

        StringBuilder str = new StringBuilder();

        str.append(a).append("+").append(b).append("  = ").append(a + b).append("\n");
        str.append(a).append("-").append(b).append("  = ").append(a - b).append("\n");
        str.append(a).append("*").append(b).append("  = ").append(a * b).append("\n");
        System.out.println(str.toString());

        str.replace(5, 7, "равно");
        str.replace(19, 21, "равно");
        str.replace(34, 36, "равно");
        System.out.println(str.toString());
    }
}