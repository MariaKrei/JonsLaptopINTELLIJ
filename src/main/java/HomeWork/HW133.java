package HomeWork;

public class HW133 {
   public   int countA(String s) {
       int count = 0;
       char a = 'a';
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == a) {

               count++;

           }


       }System.out.println(count); return count;

   } }
class HW133Tester{
    public static void main(String[] args) {
       HW133 b=new HW133();
       b.countA("makarena");

    }
}