package Class19;

import org.openqa.selenium.chrome.ChromeDriver;

public class E3Polly {
    public static void main(String[] args) throws InterruptedException {


    ChromeDriver chromeDriver=new ChromeDriver();
    chromeDriver.navigate().to("http://facebook.com");
    Thread.sleep(2000);
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();

}}
