package HomeWork;

public class HW128 {
    /*//test case below (dont change):
	public static void main(String[] args){
	  String firstValue = mixString("12345","abcde");
		System.out.println(firstValue);
		String secondValue = mixString("howdy","hello");
		System.out.println(secondValue);
*/
    static String s1;
    static String s2;

    public void print(String s1, String s2) {
        for (int i = 0; i <s1.length() ; i++) {
            for (int j = 0; j <s2.length() ; j++) {

            }
            System.out.print(s1.charAt(i)+""+s2.charAt(i));

        }
    }

    public static void main(String[] args) {
       HW128 n= new HW128();
       n.print("Maria","12345");
    }
}
