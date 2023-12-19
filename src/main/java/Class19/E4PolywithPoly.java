package Class19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E4PolywithPoly {
    public static void main(String[] args) throws InterruptedException {
        WebDriver[] arr={new ChromeDriver(), new FirefoxDriver(), new EdgeDriver()};
        for (int i = 0; i < arr.length; i++) {
            WebDriver webDriver=arr[i];

            webDriver.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            webDriver.navigate().to("http://syntaxtech.com");
            webDriver.navigate().back();
            webDriver.quit();
        }

    }

}
