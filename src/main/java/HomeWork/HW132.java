package HomeWork;

public class HW132 {
    /*Complete the reduce10 method by making it subtract 10 from every element of the double array nums.

The method should static and it should return a new 2D array object

Print values from new array in the format below
input*/


    private int[] arr;


    public HW132(int[] arr) {
        this.arr = arr;
    }

    public void reduce10(){
        int num1;
        for (int i = 0; i < arr.length ; i++) {
            num1=arr[i]-10;
            System.out.print(num1+" ");



        }

    }







    public static void main(String[] args) {


    HW132 n=new HW132(new int[]{1,2,3,4});
    HW132 a=new HW132(new int[]{4,5,6,7});
    HW132 b=new HW132(new int[]{1,3,5,7});
        n.reduce10();
                System.out.println();
                a.reduce10();
                System.out.println();
                b.reduce10();}}
