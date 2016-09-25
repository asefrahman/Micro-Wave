package homepage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_factory.PageElements;

/**
 * Created by Asef on 9/11/2016.
 */
public class Login extends Base{
    @Test
    public void EbayLoginUser() throws InterruptedException {
        PageElements pageElements = PageFactory.initElements(driver, PageElements.class);
        pageElements.UserLoginInitial();
        typeByCss(pageElements.LoginEmailLocator(), "a11@hh.com");
        typeByCss(pageElements.LoginPasswordLocator(), "1111");

        pageElements.UserLoginClick();
        sleepFor(7);

    }
}
