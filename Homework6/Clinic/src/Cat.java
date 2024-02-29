public class Cat extends Animal{
private String noise = "meow";


    Cat (String name, int age){
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " make noise " + noise);
        }

    @Override
    public String getNoise() {
        return noise;
    }
    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }
}
