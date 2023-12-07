package Class11;

public class String1 {
    /*The most widely used class in java ans almost every other programming language.
    MOst of information inside the computer is stored and processed in form of text.

    1)We need to create an object of that class
    */
    public static void main(String[] args) {
       String str= new String("Hello World");
       //String is data type
     //   str is variable name
        //new String () is creating the object of String
       //calling the length method using str object
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat(" Hello batch 18"));
        //but we should use this type of  concat
        System.out.println(str+"Hello batch 18");
    }
}
