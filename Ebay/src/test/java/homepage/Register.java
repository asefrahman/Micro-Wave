package homepage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_factory.PageElements;


/**
 * Created by Asef on 9/11/2016.
 */
public class Register extends Base {
    @Test
    public void EbaySignupUser() throws InterruptedException {
        PageElements userRegister = PageFactory.initElements(driver, PageElements.class);
        userRegister.UserRegInitial();
        typeByCss(userRegister.RegEmailLocator(), "a11@hh.com");
        typeByCss(userRegister.RegReEmailLocator(), "a11@hh.com");
        typeByCss(userRegister.RegPasswordLocator(), "1111");
        typeByCss(userRegister.RegFirstNameLocator(), "aa");
        typeByCss(userRegister.RegFirstNameLocator(), "aa");


        userRegister.UserRegClick();
        sleepFor(7);
    }
}
