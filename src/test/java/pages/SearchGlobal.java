package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchGlobal {


    //Locators for search box and laptop suggestions
    public WebDriver driver;

    //click on Search box
    By searchBox = By.xpath("//input[@class='css-11aywtz r-6taxm2 r-1niwhzg r-1jkafct r-1yadl64 r-otzu27 r-1inkyih r-16dba41 r-eu3ka r-1smd7e2 r-t60dpp r-13qz1uu']");
    //laptop suggestions
    By laptopSuggestion = By.xpath("//div[@class='css-175oi2r r-14lw9ot r-5qlx7g r-nefvgx r-1xfd6ze r-svr277 r-1udh08x r-u8s1d r-zpuk3k r-13qz1uu r-1s3egr7']");



    // Constructor can be used to initialize elements if needed
    public SearchGlobal(WebDriver driver) {
        this.driver = driver;

    }


    // Method to enter "laptop" in the search box and return the list of laptop suggestions
    public List<WebElement> laptopSuggestion() throws InterruptedException {

       WebElement searchField = driver.findElement(searchBox);
       searchField.sendKeys("laptop");
       System.out.println("Laptop entered in the search box successfully");
       Thread.sleep(2000);

       /*
       for (WebElement suggestion : driver.findElements(laptopSuggestion)) {
           System.out.println(suggestion.getText());
           driver.findElement(searchBox).clear();
       }*/
       return driver.findElements(laptopSuggestion);
        }
    }

