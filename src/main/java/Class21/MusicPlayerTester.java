package Class21;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPLayer[] arr={new CDPlayer("Love Love ", 25),
                new MP3Player("Jingle bells", 30),
                new StreamingPlayer("Forget me", 15) };
        for (MusicPLayer a:arr){
            a.play();
            a.stop();
            a.pause();
        }
    }
}
