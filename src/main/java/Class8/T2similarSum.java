package Class8;

public class T2similarSum {
    public static void main(String[] args) {


    int [] numbers={20,25,21,45,85,10,20,33,63,85,99};
    int sumDivided3=0, sumDivided5=0;
    for(int x:numbers){
        if (x%3==0){
            sumDivided3=sumDivided3+x;
        }if (x%5==0){
            sumDivided5=sumDivided5+x;
        }
        }
        System.out.println("sum of numbers Divided by 3 "+sumDivided3);
        System.out.println("sum divided by 5 "+sumDivided5);

    }

}
