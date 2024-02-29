public class Drum implements Instrument {
    String size = "39 см";

    @Override
    public void play() {
        System.out.println("Играет драм, с размером " + size);
    }
}
