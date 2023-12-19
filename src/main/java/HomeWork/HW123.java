package HomeWork;

public class HW123 {
    private int value1;
    private String value2;
    double value3;
    boolean value4;
    float value5;

    public HW123() {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
    }
    public void printInfo(){
        System.out.println(value1);

    }
    public void printInfo2(){
        System.out.println(value2);}
    public void printInfo3(){
        System.out.println(value3);}
    public void printInfo4(){
        System.out.println(value4);}
    public void printInfo5(){
        System.out.println(value5);}

    public static void main(String[] args) {
        HW123 v1=new HW123();
        v1.printInfo();
       v1.printInfo2();
       v1.printInfo3();
       v1.printInfo4();
       v1.printInfo5();
    }
}
