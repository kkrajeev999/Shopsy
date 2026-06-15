/*
package test;

import baseclass.BaseClassTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.SearchGlobal;

import java.util.List;

public class SearchGlobalTest1 extends BaseClassTest {




    @Test
    public void searchboxHome1() throws InterruptedException {
        SearchGlobal searchGlobal = new SearchGlobal(driver);

        Thread.sleep(2000);


        //Note - Flipkart Autosuggestion.
        */
/*//*
/close the login pop-up
        driver.findElement(By.xpath("//span[@class=\"b3wTlE\"]")).click();
        Thread.sleep(2000);
        //pass the values in the search box
        driver.findElement(By.xpath("(//input[@class=\"nw1UBF v1zwn25\"])[1]")).sendKeys("iphone 15");
        Thread.sleep(2000);

        *//*
*/
/*driver.findElement(By.xpath("(//*[contains(text(),'Apple iPhone 15 (Black, 128 GB)')]/parent::div/parent::div/child::div)[2]//*[contains(text(),'₹59,900')]")).click();
        Thread.sleep(2000);
        System.out.println("Iphone selected successfully");*//*
*/
/*
        Thread.sleep(5000);
        List<WebElement> Laptopsuggestions = driver.findElements(By.xpath("//ul[@class='VCplLH lTpUwR bRjjIF _1psv1ze5l _1psv1ze9l _1psv1ze7c _1cisqlf2']"));

        for (WebElement suggestion : Laptopsuggestions) {
            System.out.println(suggestion.getText());

            if (suggestion.getText().contains("iphone 15 pro max")) {
                suggestion.click();
                System.out.println("Iphone selected successfully");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 15 Pro Max (Natural Titanium, 1 TB')]")).click();
                System.out.println("View details of the product Iphone 15 Pro Max");
                //Assert.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/search?q=iphone+15+pro+max&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_4_9_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_9_na_na_na&as-pos=4&as-type=RECENT&suggestionId=iphone+15+pro+max&requestId=991e0a6d-b8a0-47ca-ba92-e2f046589c77&as-searchtext=iphone%2015%20pro%20max");
                break; // Exit the loop after clicking the desired suggestion
*//*


        //Note - Shopsy Autosuggestion.
        //searchGlobal.laptopSuggestion();
        System.out.println("Laptop suggestion displayed successfully");




        List<WebElement> autoSuggestions = searchGlobal.laptopSuggestion();


        for (WebElement suggestion : autoSuggestions) {
            if (suggestion.getText().contains("laptop under 30000")) {
                suggestion.click();
                System.out.println("Laptop under 30000 selected");
                break;
            }
        }


        }}


        @Test
        public void searchboxHome() throws InterruptedException {
            WebDriver driver = null;
            SearchGlobal searchGlobal = new SearchGlobal(driver);
        List<WebElement> autoSuggestions2 = searchGlobal.laptopSuggestion();
        for (WebElement suggestion : autoSuggestions2) {
        if (suggestion.getText().contains("laptop bag")) {
            suggestion.click();
            System.out.println("Laptop bag selected");
            break;
        }
    }}


             // Exit the loop after clicking the desired suggestion






*/
