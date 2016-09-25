package Search;

import common.Base;
import dataFromExcel.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_factory.PageElements;

import java.io.IOException;

/**
 * Created by Asef on 9/4/2016.
 */
public class SearchItems extends Base {
    @Test
    public void Search() throws InterruptedException, IOException {
//        typeByCss("#gh-ac", "laptops");
//        clickByCss("#gh-btn");
//        sleepFor(5);
       PageElements search = PageFactory.initElements(driver, PageElements.class);
        //Read search.data from excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getData();
        for(String read:value) {
//            search.typeByCss(search.SearchBoxLocator(),read);
//            search.clickByCss(search.SearchClickLocator());
//            sleepFor(7);
//            search.clearSearchInput();
            search.searchFor(read);
//            search.userSearchSubmit();
            sleepFor(7);
            search.clearSearchInput();
        }
//        typeByCss(search.SearchBoxLocator(),"Laptop");
//        clickByCss(search.SearchClickLocator());
//        sleepFor(7);

    }
    }
