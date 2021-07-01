package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GooglePage;
import utils.Driver;

import java.util.Locale;

public class testGoogleSearch {
    GooglePage googlePage = new GooglePage();

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get("https://google.com");
    }

    @Test
    public void testGoogleSearchBox() throws InterruptedException {
        try {
            Thread.sleep(5000);
            googlePage.searchBox.sendKeys(searchThisWordInGoogleSearch("Duck") + Keys.ENTER);

        } catch (Exception e) {
            System.out.println(e.getMessage()+" element not found");
        }

        String searchItem = searchThisWordInGoogleSearch("Duck");
        String titleAfterSearch = Driver.getDriver().getTitle();
        Assert.assertTrue(titleAfterSearch.contains(searchItem));
    }

    public String searchThisWordInGoogleSearch(String word){
        //any requirements about word will be clarified here
        word = word.toLowerCase();
        return word;
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
