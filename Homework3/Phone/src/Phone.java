public class Phone {
    String number;
    String model;
    String weight;

    public Phone() {
        number = "136";
        model = "iPhone 11";
        weight = "194 г";
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String numder, String model) {
        this.number = numder;
        this.model = model;
    }

    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправить сообщение на номера: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}