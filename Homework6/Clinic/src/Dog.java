public class Dog extends Animal{

    Dog (String name, int age, String noise){
        super(name, age, noise);
    }


    @Override
    public void makeNoise() {
        System.out.println(getName() + " make noise " + getNoise());
    }
}
