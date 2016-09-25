package page_factory;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Asef on 9/18/2016.
 */
public class PageElements extends Base {
    @FindBy(how = How.CSS, using = "#gh-ug>a")
    public WebElement LoginInitial;
    @FindBy(how = How.CSS, using = "#sgnBt")
    public WebElement LoginClick;
    @FindBy(how = How.CSS, using = "#gh-ug-flex>a")
    public WebElement RegInitial;
    @FindBy(how = How.CSS, using = "#sgnBt")
    public WebElement RegClick;
    @FindBy(how = How.CSS, using = "#gh-ac")
    public WebElement SearchInput;


    public void UserLoginInitial() {
        LoginInitial.click();
    }
    public void UserLoginClick() {
        LoginClick.click();
    }
    public String LoginEmailLocator() {
        return "#formDiv #pri_signin .fld";
    }

    public String LoginPasswordLocator() {
        return "#formDiv #pri_signin .m19 .fld";


    }
    public void UserRegInitial() {
        RegInitial.click();
    }
    public void UserRegClick(){
        RegClick.click();
    }
    public String RegEmailLocator(){
        return "#email";
    }
    public String RegReEmailLocator(){
        return "#remail";
    }
    public String RegPasswordLocator(){
        return "#PASSWORD";
    }
    public String RegFirstNameLocator(){
        return "#firstname";
    }
    public String RegLastNameLocator(){
        return "#lastname";
    }
    public String RegPhoneLocator(){
        return "#phoneFlagComp1";
    }
    public String SearchBoxLocator(){
        return "#gh-ac";
    }
    public String SearchClickLocator(){
        return "#gh-btn";
    }
    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = "#gh-btn")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void userSearchSubmit(){
        searchSubmit.click();
    }

    public void clearSearchInput(){
        searchInput.clear();
    }
}

