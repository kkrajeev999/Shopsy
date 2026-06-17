package pages;

import io.reactivex.rxjava3.functions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class WomenClothingLinkPage {

    public WebDriver driver;

    By womenClothingLink = By.xpath("(//div[contains(text(),'Women Clothing')])");
    By  ethnicWear = By.xpath("(//div[@class='css-175oi2r r-1habvwh r-eqz5dr r-1h0z5md r-1n9hl4b r-b5h31w r-1ah4tor'])[1]");
    //By ethnicwear = By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[1]");
    By  westerwear = By.xpath("(//div[@class='css-175oi2r r-1habvwh r-eqz5dr r-1h0z5md r-1n9hl4b r-b5h31w r-1ah4tor'])[2]");
    By  winterwear  = By.xpath("(//div[@class='css-175oi2r r-1habvwh r-eqz5dr r-1h0z5md r-1n9hl4b r-b5h31w r-1ah4tor'])[3]");
    By innerwear = By.xpath("(//div[@class='css-175oi2r r-1habvwh r-eqz5dr r-1h0z5md r-1n9hl4b r-b5h31w r-1ah4tor'])[4]");
    By  loungewearandactivewear = By.xpath("(//div[@class='css-175oi2r r-1habvwh r-eqz5dr r-1h0z5md r-1n9hl4b r-b5h31w r-1ah4tor'])[5]");

    public WomenClothingLinkPage(WebDriver driver) {
        this.driver = driver;
    }

      public void moveWomenClothingLink() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(womenClothingLink)).perform();
        System.out.println("moved to Women's Clothing link successfully");
}

        public void clickEthnicWear() throws InterruptedException {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(womenClothingLink)).perform();
            System.out.println("Ethnic Wear link clicked successfully");
            Thread.sleep(2000);
            List<WebElement> ethnicWearElement = driver.findElements(ethnicWear);
            System.out.println("Number of Ethnic Wear elements found: " + ethnicWearElement.size());
            for (WebElement ethnicWear : ethnicWearElement) {
                System.out.println(ethnicWear.getText());
                System.out.println("Ethnic Wear link clicked successfully");
                break; // Exit the loop after clicking the desired suggestion

            }}
            public void clickWesterWear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(womenClothingLink)).perform();
                System.out.println("Wester Wear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> westerWearElement = driver.findElements(westerwear);
                System.out.println("Number of Wester Wear elements found: " + westerWearElement.size());
                for (WebElement westerWear : westerWearElement) {
                    System.out.println(westerWear.getText());
                    System.out.println("Wester Wear link clicked successfully");
        }}
            public void clickWinterWear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(womenClothingLink)).perform();
                System.out.println("Winter Wear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> winterWearElement = driver.findElements(winterwear);
                System.out.println("Number of Winter Wear elements found: " + winterWearElement.size());
                for (WebElement winterWear : winterWearElement) {
                    System.out.println(winterWear.getText());
                    System.out.println("Winter Wear link clicked successfully");
    }}
            public void clickInnerWear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(womenClothingLink)).perform();
                System.out.println("Inner Wear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> innerWearElement = driver.findElements(innerwear);
                System.out.println("Number of Inner Wear elements found: " + innerWearElement.size());
                for (WebElement innerWear : innerWearElement) {
                    System.out.println(innerWear.getText());
                    System.out.println("Inner Wear link clicked successfully");
    }}
            public void clickLoungewearAndActivewear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(womenClothingLink)).perform();
                System.out.println("Loungewear and Activewear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> loungewearAndActivewearElement = driver.findElements(loungewearandactivewear);
                System.out.println("Number of Loungewear and Activewear elements found: " + loungewearAndActivewearElement.size());
                for (WebElement loungewearAndActivewear : loungewearAndActivewearElement) {
                    System.out.println(loungewearAndActivewear.getText());
                    System.out.println("Loungewear and Activewear link clicked successfully");
    }}
}