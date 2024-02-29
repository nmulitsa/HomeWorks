public abstract class Animal {
    private String name;
    private int age;
    private String noise;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    Animal(String name,int age, String noise){
        this.name = name;
        this.age= age;
        this.noise = noise;
    }

    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
