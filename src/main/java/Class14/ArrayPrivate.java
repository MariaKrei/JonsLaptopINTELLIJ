package Class14;

public class ArrayPrivate {
    int sumArray(int[] arr ){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];

        }
   return sum;
   }

    public static void main(String[] args) {
        ArrayPrivate t=new ArrayPrivate();
        int [] numbers= {10,20,30};
        int sum=t.sumArray(numbers);
        System.out.println(sum);
    }}
