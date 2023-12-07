package Class10;

public class PhoneTester {
    public static void main(String[] args) {


    Phone iphone=new Phone();
    iphone.color="blue";
    iphone.brand="apple";
    iphone.size="large";
    iphone.model=11;
    iphone.year=2011;
        System.out.println(iphone.brand);
        System.out.println(iphone.color);
        System.out.println(iphone.size);
        iphone.sendText();
    iphone.call();
        System.out.println("*******************");

        System.out.println("Pixel");
        Phone pixel=new Phone();
        pixel.color="gray";
        pixel.brand="microsoft";
        pixel.size="small";
        System.out.println(pixel.brand);
        System.out.println(pixel.color);
        System.out.println(pixel.size);

        pixel.sendText();
        pixel.call();

        System.out.println("*****************");

        Phone sams=new Phone();
        sams.color="white";
        sams.brand="samsung";
        pixel.size="medium";
        System.out.println(sams.brand);
        System.out.println(sams.color);
        System.out.println(sams.size);

        sams.sendText();
        sams.call();










    } }
