package tests;


import mh.framework.base.FrameworkInitilaize;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;


/**
 * Created by Mahmoud on 21/10/2017.
 */
public class Login extends FrameworkInitilaize{


    //public static WebDriver driver;

    @Test

    public void Initialize() {
        //Open the browser

        HomePage homePage=new HomePage();
        homePage.EnterSearchTest("Utrecht");
        homePage.ClickSearchbtn();


    }


}
