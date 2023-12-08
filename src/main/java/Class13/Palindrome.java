package Class13;

public class Palindrome {
    void isPalindrome (String x){
        String reverse="";
        for (int i = x.length()-1; i>=0; i--) {
            reverse=reverse+x.charAt(i);
    }if (x.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }


    }
}
