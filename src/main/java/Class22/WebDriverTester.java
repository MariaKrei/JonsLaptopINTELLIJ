package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(), new FireFox()};
        for (WebDriver browser:arr){
            browser.openBrowser();
            browser.maximizeWindow();
            browser.findElement();
            browser.closeBrowser();
        }

    }
}
