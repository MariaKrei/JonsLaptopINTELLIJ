package Class19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E4PolyWithoutPoly {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chromeDriver.navigate().to("http://syntaxtech.com");
        chromeDriver.navigate().back();
        chromeDriver.close();
        FirefoxDriver firefoxDriver=new FirefoxDriver();
       firefoxDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        firefoxDriver.navigate().to("http://syntaxtech.com");
        firefoxDriver.navigate().back();
        firefoxDriver.close();
    }
}
