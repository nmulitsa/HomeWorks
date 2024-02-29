public class Rat extends Animal {
    Rat(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeNoise() {
        System.out.println(getName() + " make noise pi-pi-pi");
    }
}
