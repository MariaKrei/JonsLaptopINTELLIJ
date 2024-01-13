package W3School;

public class RepetativeT10 {
    public static void main(String[] args) {
        String word="mariafmaria";
        for (int i = 0; i <word.length() ; i++) {
            if (word.indexOf(word.charAt(i), i+1)==-1){
                System.out.println(" The first non repetative letter is "+word.charAt(i));
                break;
            }}}}
    /* public static void main(String[] args) {
            String str = "mariafmaria";
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i), i + 1) == -1) {
                    System.out.println("First non-repeating character is: " + str.charAt(i));
                    break;
                }
            }
        }

                }*/

