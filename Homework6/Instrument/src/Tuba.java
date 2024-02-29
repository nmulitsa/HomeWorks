public class Tuba implements Instrument {
    String diam = "35 мм";

    @Override
    public void play() {
        System.out.println("Играет туба, с диаметром " + diam);
    }
}
