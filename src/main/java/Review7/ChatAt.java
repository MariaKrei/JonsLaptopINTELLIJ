package Review7;

public class ChatAt {
    public static void main(String[] args) {
        String str="Today is a jaca review class";
        System.out.println(str.charAt(4));
        str=str.toLowerCase();
        int counter=0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }

            //how many times aappear


        }System.out.println("Letter a appeared "+counter+" times");
    }
}
