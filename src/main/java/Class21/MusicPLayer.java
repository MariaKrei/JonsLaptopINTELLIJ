package Class21;

public abstract class MusicPLayer {
private String currentTrack;
private int volume;
    public MusicPLayer(String currentTrack, int volume) {
        this.currentTrack = currentTrack;
        this.volume = volume;}
 public abstract void play();
 public abstract void pause();
 public abstract void stop();}
class CDPlayer extends MusicPLayer{
    public CDPlayer(String currentTrack, int volume){
        super(currentTrack, volume);
    }
    public void play(){
        System.out.println("Play song ");
    }
    public void pause(){
        System.out.println("Pause playing song");
    }
    public void stop(){
        System.out.println("Stop play song by press button stop");
    }}
class MP3Player extends MusicPLayer{
    public MP3Player(String currentTrack, int volume) {
        super(currentTrack, volume);
    }
    public void play(){
        System.out.println("Play this song many times");
    }
    public void pause(){
        System.out.println("PLease press button pause to pause playing");
    }
    public void stop(){
        System.out.println("Please remove CD from player to stop playing");
    }}
class StreamingPlayer extends MusicPLayer{
    public StreamingPlayer(String currentTrack, int volume){
        super(currentTrack, volume);
    }
    public void play(){
        System.out.println("Play play play");}
    public void pause(){
        System.out.println("press button pause to pause music ");}
    public void stop(){
        System.out.println("Please press button stop");
    }
}
