package Class22;

public interface WebDriver {
   void openBrowser();
   void closeBrowser();
   void maximizeWindow();
   void findElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open your Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close your chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize your window on chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find your element using Chrome browser");
    }
}
class FireFox implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open your firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close your firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window on your firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find element on your firefox browserWebdriver ch=new C");
    }
}
