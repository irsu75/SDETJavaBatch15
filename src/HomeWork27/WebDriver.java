package HomeWork27;

 public interface WebDriver {
     /*
   Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
      */
     void openBrowser();
     void  closeBrowser();
     void maximizeWindow();
     void findElement();

}
class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Click on Google Chrome App to open Browser");
    }

    @Override
    public void closeBrowser() {

    System.out.println("Click x button to close Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find Google Chrome Element");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on square button to maximize Window ");

    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Click on Google Chrome App to open Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Click x button to close Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find Google Chrome Element");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on square button to maximize Window ");
    }
}
