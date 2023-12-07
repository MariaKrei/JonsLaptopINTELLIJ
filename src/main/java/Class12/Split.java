package Class12;

public class Split {
    public static void main(String[] args) {
        String str="It's Saveras Birthday tpday. Its Sunday. Today is Java Class";
     String[] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[2].trim());
        String [] wordArr=str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[0]);
    }
}
