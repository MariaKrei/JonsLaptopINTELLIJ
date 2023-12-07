package Class5;

public class AndOp {
    public static void main(String[] args) {
        boolean doYouHaveCard=true;
        boolean doYouHaveID=true;
        boolean areYouOver18=false;
        if (doYouHaveCard&&doYouHaveID&&areYouOver18){
            System.out.println("you can buy alcohol");
        }else{
            System.out.println("you cannot buy alcohol");
        }


    }
}
