package test;

import baseclass.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SearchGlobal;
import utilities.ExtentListener;

@Listeners(ExtentListener.class)
public class SearchTest extends BaseClassTest {


    @Test (groups ={"Smoke"})
    public void seachboxHome() throws InterruptedException {
        SearchGlobal searchGlobal = new SearchGlobal(driver);
        searchGlobal.laptopSuggestion();
    }


    @Test (groups ={"Smoke"})
    public void searchboxHome1() throws InterruptedException {
        SearchGlobal searchGlobal = new SearchGlobal(driver);
        //WebElement suggestion = (WebElement) searchGlobal.laptopSuggestion();

        Thread.sleep(2000);
        for (WebElement laptopSuggestion : searchGlobal.laptopSuggestion()) {
            /*System.out.println(laptopSuggestion.getText());*/
            if (laptopSuggestion.getText().contains("laptop under 30000")) {
                /*//Assert.assertEquals("laptop lenovo", laptopSuggestion.getText());
                //Assert.assertEquals("laptop lenovo", "laptop lenovo");
                Assert.assertEquals(laptopSuggestion.getText(), "laptop under 30000", "Laptop suggestion does not match the expected value");
               */
                laptopSuggestion.click();
                System.out.println("laptop under 30000 selected successfully");
                Thread.sleep(2000);
                break; // Exit the loop after clicking the desired suggestion

            }

    }}
        @Test   (groups ={"Smoke"})
       public void searchboxHome2() throws InterruptedException {
        SearchGlobal searchGlobal = new SearchGlobal(driver);
        //WebElement suggestion = (WebElement) searchGlobal.laptopSuggestion();
        //searchGlobal.laptopSuggestion();
        Thread.sleep(2000);
        for (WebElement laptopSuggestion : searchGlobal.laptopSuggestion()) {
            System.out.println(laptopSuggestion.getText());
            if (laptopSuggestion.getText().contains("laptop bag")) {
                laptopSuggestion.click();
                System.out.println("Laptop bag selected successfully");
                Thread.sleep(2000);
                break; // Exit the loop after clicking the desired suggestion
            }


        }
    }   @Test   (groups ={"Smoke"})
        public void searchboxHome3() throws InterruptedException {
            SearchGlobal searchGlobal = new SearchGlobal(driver);
            //WebElement suggestion = (WebElement) searchGlobal.laptopSuggestion();
            //searchGlobal.laptopSuggestion();
            Thread.sleep(2000);
            for (WebElement laptopSuggestion : searchGlobal.laptopSuggestion()) {
                System.out.println(laptopSuggestion.getText());
                if (laptopSuggestion.getText().contains("laptop stand")) {
                    laptopSuggestion.click();
                    System.out.println("Laptop stand selected successfully");
                    Thread.sleep(2000);
                    break; // Exit the loop after clicking the desired suggestion
                }
}}          @Test   (groups ={"Smoke"})
            public void searchboxHome4() throws InterruptedException {
                SearchGlobal searchGlobal = new SearchGlobal(driver);
                //WebElement suggestion = (WebElement) searchGlobal.laptopSuggestion();
                //searchGlobal.laptopSuggestion();
                Thread.sleep(2000);
                for (WebElement laptopSuggestion : searchGlobal.laptopSuggestion()) {
                    System.out.println(laptopSuggestion.getText());
                    if (laptopSuggestion.getText().contains("laptop charger")) {
                        laptopSuggestion.click();
                        System.out.println("Laptop charger selected successfully");
                        Thread.sleep(2000);
                        break; // Exit the loop after clicking the desired suggestion
                    }
}}         @Test   (groups ={"Smoke"})
            public void searchboxHome5() throws InterruptedException {
                SearchGlobal searchGlobal = new SearchGlobal(driver);
                //WebElement suggestion = (WebElement) searchGlobal.laptopSuggestion();
                //searchGlobal.laptopSuggestion();
                Thread.sleep(2000);
                for (WebElement laptopSuggestion : searchGlobal.laptopSuggestion()) {
                    System.out.println(laptopSuggestion.getText());
                    if (laptopSuggestion.getText().contains("laptop cooling pad")) {
                        laptopSuggestion.click();
                        System.out.println("Laptop cooling pad selected successfully");
                        Thread.sleep(2000);
                        break; // Exit the loop after clicking the desired suggestion
                    }
    }}      @Test   (groups ={"Smoke"})
            public void searchboxHome6() throws InterruptedException {
                SearchGlobal searchGlobal = new SearchGlobal(driver);
                //WebElement suggestion = (WebElement) searchGlobal.laptopSuggestion();
                //searchGlobal.laptopSuggestion();
                Thread.sleep(2000);
                for (WebElement laptopSuggestion : searchGlobal.laptopSuggestion()) {
                    System.out.println(laptopSuggestion.getText());
                    if (laptopSuggestion.getText().contains("laptop sleeve")) {
                        laptopSuggestion.click();
                        System.out.println("Laptop sleeve selected successfully");
                        Thread.sleep(2000);
                        break; // Exit the loop after clicking the desired suggestion
                    }
}}}
