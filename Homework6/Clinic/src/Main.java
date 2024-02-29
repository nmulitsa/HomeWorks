public class Main {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Cat("Kitty", 12);
        pets[1] = new Dog("Boba", 2, "gav-gav");
        pets[2] = new Rat("Biba", 1);

        for (Animal c : pets) {
            c.makeNoise();
        }
    }
}