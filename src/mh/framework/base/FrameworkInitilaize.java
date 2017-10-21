package mh.framework.base;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitilaize extends DriverContext {


    public FrameworkInitilaize() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahmoud\\Downloads\\Newfolder\\geckodriver.exe");
        DriverContext.Driver = new FirefoxDriver();
        DriverContext.Driver.get("https://www.funda.nl/");
    }


}
