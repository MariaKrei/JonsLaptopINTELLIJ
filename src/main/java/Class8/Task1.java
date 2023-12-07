package Class8;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers={101,100,25,30,25,50,300};

           int countBy2=0;
           int countBy5=0;
           for (int num: numbers){
               if (num%2==0){
                   countBy2++;


            }
               if (num%5==0){
                   countBy5++;
               }
        }System.out.println("There are "+countBy2+ " divided by 2");
        System.out.println("There are "+countBy5+ " divided by 5");
    }
}
