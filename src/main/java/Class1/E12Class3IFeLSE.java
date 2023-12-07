package Class1;

public class E12Class3IFeLSE {
    public static void main(String[] args) {
        String name="Sino";
        //whenever we have non primitive time we should never use sign ==  we should type if(name.equals()
        if(!name.equals("Sino")) {
            System.out.println("Fast");
        }else{
            System.out.println("Moderate");
        }
    }
}
