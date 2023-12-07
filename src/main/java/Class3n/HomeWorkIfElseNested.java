package Class3n;

public class HomeWorkIfElseNested {
    public static void main(String[] args) {
        boolean degree=true;
        double score=3.5;
        if (degree){
            System.out.println("Congratulation");
            if (score>=3.5){
                System.out.println("You are eligible for scholarship");
            }


        }else{
            System.out.println("You should have studied harder");
        }
    }
}
