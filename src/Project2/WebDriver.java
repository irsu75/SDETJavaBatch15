package Project2;

public interface WebDriver {
    /*
  Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
  ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them
 */
    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface takesScreenshot extends WebDriver{
    void getScreenshot();
}
 class ChromeDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
 class Firefox implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open FireFox Browser");

    }

    @Override
    public void close() {
        System.out.println("Close FireFox Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Safari implements WebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }
}


