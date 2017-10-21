package pageObjectModel;

import mh.framework.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Mahmoud on 21/10/2017.
 */
public class HomePage extends BasePage {

    public HomePage() {
    }

    @FindBy(how = How.NAME, using = "filter_location")
    public WebElement textboxSearch;

    @FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div[3]/form/div[1]/div/div/button")
    public WebElement btnSearch;


    public  void EnterSearchTest(String searchText){


        textboxSearch.sendKeys(searchText);
        textboxSearch.sendKeys(Keys.ENTER);


    }
    public void ClickSearchbtn(){
        btnSearch.click();


    }

}
