public class Main {
    public static void main(String[] args) {
Instrument[] music = new Instrument[3];
music[0]= new Guitar();
music[1]=new Tuba();
music[2]=new Drum();

for (Instrument a: music){
    a.play();
}
    }
}