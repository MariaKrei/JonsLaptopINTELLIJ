package HomeWork;

public class HW98 {
    public static void main(String[] args) {
        String given="Hello Syntax friends";
        //"Welcome Syntax family"
        String[] givenArr=given.split(" ");
        System.out.println(given.replaceAll(givenArr[0],"Welcome").replaceAll(givenArr[2],"family"));

    }
}
