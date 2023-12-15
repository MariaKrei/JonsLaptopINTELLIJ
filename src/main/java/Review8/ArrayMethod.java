package Review8;

public class ArrayMethod {

    public static int sum(int[] arr) { //static if we dont using any instance fields

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int[] a={10,20,56};

        ArrayMethod.sum(new int[]{10, 20, 56});
    }


}
