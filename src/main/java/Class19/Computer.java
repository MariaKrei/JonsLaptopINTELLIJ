package Class19;

public class Computer {
    public Computer(String brand, int ram, int storage) {
    }

    public void download(){
        System.out.println("can download websites ");
    }
    public void reloadPage(){
        System.out.println("can reload page");
    }
    public void showPictures(){
        System.out.println("can show pictures");
    }
}
class Apple extends Computer{
    public Apple(String brand, int ram, int storage) {
        super(brand, ram, storage);
    }

    public void download(){
        System.out.println("can show apple ");
    }
    public void playMusic(){
        System.out.println("Play dance music");
    }

}
class Lenovo extends Computer{
    public Lenovo(String brand, int ram, int storage) {
        super(brand, ram, storage);
    }

    public void download(){
        System.out.println("can show Lenovo ");
    }
    public void playGames(){
        System.out.println("play games");
    }
}
class Hp extends Computer{
    public Hp(String brand, int ram, int storage) {
        super(brand, ram, storage);
    }

    public void reloadPage(){
        System.out.println("can show black screen sometimes");
    }
    public void sendMessages(){
        System.out.println("can send messages");
    }
}
class Dell extends Computer{
    public Dell(String brand, int ram, int storage) {
        super(brand, ram, storage);
    }

    public void reloadPage(){
        System.out.println("reload reload reload");
    }
    public void studyCourse(){
        System.out.println("You can study ");
    }
}
