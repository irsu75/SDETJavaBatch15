package Project2;

public class WebDriverTester {

    public static void main(String[] args) {
        WebDriver [] webDriver={new ChromeDriver(),new Firefox(),new Safari()};
       for(WebDriver web:webDriver){
           web.open();
           web.close();
           web.getTitle();

        }

    }
}
