package HomeWork;

public class MethodArray {
    int findSum (int[] arr ){
        int num=0;
        for (int i = 0; i <arr.length ; i++) {
            num=num+arr[i];


        }return num;
    }

    public static void main(String[] args) {
        MethodArray n=new MethodArray();
       int[] array={10,20,30,40,50};
        System.out.println(n.findSum(array));
    }
}
