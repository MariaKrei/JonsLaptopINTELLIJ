package HomeWork;

import java.util.Scanner;

public class T37 {
    public static void main(String[] args) {
        /*"Are you thirsty?"

"Are you sleepy?"

If user is thirsty and not sleepy--> drink=water

If user is thirsty and sleepy--> drink=coffee

If user is not thirsty and sleepy --> drink=tea

Otherwise drink="nothing"
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty=sc.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy=sc.nextBoolean();
        if (thirsty&&!sleepy){
            System.out.println("Drink=water");
        }else if (thirsty&&sleepy){
            System.out.println("drink=coffee");
        }else if (!thirsty&&sleepy){
            System.out.println("drink=tea");
        }
        System.out.println("Looks like you need to drink nothing");
    }

}
