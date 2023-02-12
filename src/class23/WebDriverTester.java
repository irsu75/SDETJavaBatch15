package class23;

public class WebDriverTester {
    public static void main(String[] args) {

     /*   Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();

      */


    /*    WebDriver webDriver=new FireFox();// up casting
    //    FireFox fireFox=new WebDriver(); down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();
     // an Array of the parent class can hold the objects of all the child classes

     */
        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()};

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }
    }
}
