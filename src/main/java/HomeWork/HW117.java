package HomeWork;

public class HW117 {
    int x;
    public void SumEvenToX(int x){
        int sum=0;
        for (int i = 0; i <=x;  i=i+2) {
            sum=sum+i;

        }System.out.println(sum);

    }

    public static void main(String[] args) {
        HW117 n=new HW117();
       n.SumEvenToX(8);
    }
}
