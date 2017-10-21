package mh.framework.base;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by Mahmoud on 21/10/2017.
 */
public class BasePage {

    public BasePage() {


        PageFactory.initElements(DriverContext.Driver, this);
    }
}
