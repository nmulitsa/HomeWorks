public class Guitar implements Instrument{

    int numStrings = 6;

    @Override
    public void play() {
        System.out.println("Играет гитара, с " + numStrings + " струнами");
    }
}
