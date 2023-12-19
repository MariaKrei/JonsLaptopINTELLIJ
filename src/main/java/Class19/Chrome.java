package Class19;
class Browser{
    void get(String url) {
        System.out.println("Loading ...." + url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closeBrowser(){
        System.out.println("Closing  browser");
    }
}



public class Chrome extends Browser {
    void get(String url) {
        System.out.println("Loading ...." + url);
    }
        void performTest(){
            System.out.println("Checking if website is working properly in chrome");
        }
        void closeBrowser(){
            System.out.println("Closing the Google Chrome browser");
        }
    }

class Firefox extends Browser{
    void get(String url) {
        System.out.println("Loading ...." + url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closeBrowser(){
        System.out.println("Closing FireFoxbrowser");
    }


}
class Edge extends Browser{
    void get(String url) {
        System.out.println("Loading ...." + url);
    }
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closeBrowser(){
        System.out.println("Closing Microsoft Edge browser");
    }
}
class Safari extends Browser{
    void get(String url) {
    System.out.println("Loading ...." + url);
}
    void performTest(){
        System.out.println("Checking if website is working properly in chrome");
    }
    void closeBrowser(){
        System.out.println("Closing Safari browser");
    }}
