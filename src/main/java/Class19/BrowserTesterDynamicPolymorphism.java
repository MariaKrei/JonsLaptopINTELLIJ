package Class19;

public class BrowserTesterDynamicPolymorphism {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
       chrome.get("http://amazon.com");
       chrome.performTest();
       chrome.closeBrowser();

       Firefox firefox=new Firefox();
        firefox.get("http://amazon.com");
        firefox.performTest();
       firefox.closeBrowser();

Safari safari=new Safari();
        safari.get("http://amazon.com");
        safari.performTest();
        safari.closeBrowser();

        Edge edge=new Edge();
        edge.get("http://amazon.com");
        edge.performTest();
        edge.closeBrowser();

        System.out.println("****************");
        //array that holds the objects of all browsers
        Browser[] bArr={chrome, firefox,safari,edge};
        // we can do also Browser[] bArr={new Chrome(), new Firefox(), new Safari(), new Edge()}
        //loop that picks all objects one by one from array and places it inside the b variable.
        for (int i = 0; i < bArr.length ; i++) {
            Browser b=bArr[i];
            b.get("http://amazon.com");
            b.performTest();
            b.closeBrowser();


        }
}}
