public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone n = new Phone("147", "Samsung s23", "168 г");
        Phone a = new Phone("487", "iPhone 15", "171 г");
        System.out.println("номер: " + p.number + "; " + "модель - " + p.model + "; " + "вес: " + p.weight);
        System.out.println("номер: " + n.number + "; " + "модель - " + n.model + "; " + "вес: " + n.weight);
        System.out.println("номер: " + a.number + "; " + "модель - " + a.model + "; " + "вес: " + a.weight);

        System.out.println();
        p.receiveCall("Belapb");
        System.out.println("Номер телефона " + p.getNumber());

        System.out.println();
        n.receiveCall("Belarusbank");
        System.out.println("Номер телефона " + n.getNumber());

        System.out.println();
        a.receiveCall("Prior");
        System.out.println("Номер телефона " + a.getNumber());

        System.out.println();
        a.receiveCall("Belapb", "136");

        System.out.println();
        a.sendMessage("1234566, 125632");
    }
}