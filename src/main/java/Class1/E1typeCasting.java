package Class1;

public class E1typeCasting {
    public static void main(String[] args) {
        //change of data type called casting
//automatical widening
        int age=10;
        System.out.println(age);
                double age2=age;
        System.out.println(age2);
double largeBox=10.5;
        int smallBox=(int)largeBox;
        System.out.println(smallBox);
//we cannot move from smaller box to larger
        //byte, double, int, long,
short mediumBox=1300;
byte smallestBox=(byte)mediumBox;
        System.out.println(smallestBox);
        //conversion from bix box to small box - widening

    }

}
