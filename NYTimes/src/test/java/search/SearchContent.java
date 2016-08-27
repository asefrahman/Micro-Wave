package search;

import common.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 8/21/2016.
 */
public class SearchContent extends Base {

    @Test
    public void searchNews()throws InterruptedException{
        clickByCss(".button.search-button");
        typeByCssNEnter("#search-input", "Olympic");
        sleepFor(2);
        List<WebElement> links = getListOfWebElementsByCss(".columnGroup #searchResults .searchResultsList li");
        for(int i=2; i<links.size(); i++) {
            clickByXpath(".//*[@id='searchResults']/ol/li[" + i + "]/div[2]/h3/a");
            String currenturl = driver.getCurrentUrl();
            System.out.println(currenturl);
            navigateBack();
            sleepFor(1);
        }

    }
}
