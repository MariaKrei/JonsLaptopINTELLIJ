package Class12;

public class Palidrome {
    public static void main(String[] args) {
      String str="rom";
      String reverse="";
        for (int i = str.length()-1; i>=0; i--) {
            reverse=reverse+str.charAt(i);

        }if (str.equalsIgnoreCase(reverse)){
            System.out.println("Its a palidrome");
        }else{
            System.out.println("Its not a palidrome");
        }
    }}
