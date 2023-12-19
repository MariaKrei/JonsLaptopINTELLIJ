package Class19;

public class ComputerTster {
    public static void main(String[] args) {
        Computer[] arr={new Apple("apple",10,5), new Dell("dell", 5,2), new Hp("HP",2,5), new Lenovo("Lenovo",2,3)};
        for (Computer c:arr){
            c.download();
            c.reloadPage();
            c.showPictures();
            if (c instanceof Apple){
                Apple a=(Apple) c;
                a.playMusic();
            }
            if (c instanceof Lenovo){
                Lenovo l=(Lenovo)c;
                l.playGames();
            }
            if (c instanceof Hp){
                Hp h=(Hp)c;
                h.sendMessages();
            }
            if (c instanceof Dell){
                Dell d=(Dell)c;
            }

        }
    }
}
