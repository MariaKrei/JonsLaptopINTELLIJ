package Class4;

public class NestledIf {
    public static void main(String[] args) {
        boolean isMainDoorOpened=true;
        boolean isRoom1opened=true;
        boolean isRoom2pened=true;
        if (isMainDoorOpened){
            if (isRoom1opened){
                System.out.println("We are in room 1.");
            }else{
                System.out.println("room 1 is closed");
            }
            if (isRoom2pened){
                System.out.println("We are in room2");
            }

        }else{
            System.out.println("Can't enter the house");
        }
    }

}
