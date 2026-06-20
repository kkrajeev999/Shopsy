package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class KidsClothingLinkPage {

    public WebDriver driver;

    By MenClothingLink = By.xpath("(//div[contains(text(),'Men Clothing')])");
    By  ethnicWear    =  By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[1]");
    //By ethnicwear   =  By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[1]");
    By  westerwear    =  By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[2]");
    By  winterwear    =  By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[3]");
    By innerwear      =  By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[4]");
    By  loungewearandactivewear = By.xpath("(//div[@class=\"css-175oi2r r-1habvwh r-18u37iz r-1d7fvdj r-1mi0q7o r-m611by\"])[5]");

    public KidsClothingLinkPage(WebDriver driver) {
        this.driver = driver;
    }

      public void moveMenClothingLink() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(MenClothingLink)).perform();
        System.out.println("moved to Women's Clothing link successfully");
}

        public void clickEthnicWear() throws InterruptedException {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(MenClothingLink)).perform();
            System.out.println("Ethnic Wear link clicked successfully");
            Thread.sleep(2000);
            List<WebElement> ethnicWearElement = driver.findElements(ethnicWear);
            System.out.println("Number of Ethnic Wear elements found: " + ethnicWearElement.size());
            List<String> ethnicWearTexts = new ArrayList<>();
            for (WebElement ethnicWear : ethnicWearElement) {
                String ethnicweartext = ethnicWear.getText().trim();
                System.out.println(ethnicweartext);
                if (!ethnicweartext.isEmpty()) {
                    ethnicWearTexts.add(ethnicweartext);
                    System.out.println(ethnicweartext);
                }
                System.out.println("Ethnic Wear link clicked successfully");
                break; // Exit the loop after clicking the desired suggestion

            }}
            public void clickWesterWear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(MenClothingLink)).perform();
                System.out.println("Wester Wear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> westerWearElement = driver.findElements(westerwear);
                System.out.println("Number of Wester Wear elements found: " + westerWearElement.size());
                for (WebElement westerWear : westerWearElement) {
                    System.out.println(westerWear.getText());
                    System.out.println("Wester Wear link clicked successfully");

                List<String> westerWearTexts  = new ArrayList<>();
                for (WebElement westerWearoption : westerWearElement) {
                    String westerweartext = westerWearoption.getText().trim();
                    if (!westerweartext.isEmpty()) {
                        westerWearTexts.add(westerweartext);
                        System.out.println(westerweartext);
                    }
                }
        }}
            public void clickWinterWear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(MenClothingLink)).perform();
                System.out.println("Winter Wear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> winterWearElement = driver.findElements(winterwear);
                System.out.println("Number of Winter Wear elements found: " + winterWearElement.size());
                for (WebElement winterWear : winterWearElement) {
                    System.out.println(winterWear.getText());
                    System.out.println("Winter Wear link clicked successfully");
                    List<String> winterWearsText = new ArrayList<>();
                    for (WebElement winterwearoption : winterWearElement){
                        String winterweartext = winterwearoption.getText().trim();
                        if (!winterweartext.isEmpty()){
                            winterWearsText.add(winterweartext);
                            System.out.println(winterweartext);
                        }
                    }

    }}
            public void clickInnerWear() throws InterruptedException {
                Actions action = new Actions(driver);
                action.moveToElement(driver.findElement(MenClothingLink)).perform();
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
                action.moveToElement(driver.findElement(MenClothingLink)).perform();
                System.out.println("Loungewear and Activewear link clicked successfully");
                Thread.sleep(2000);
                List<WebElement> loungewearAndActivewearElement = driver.findElements(loungewearandactivewear);
                System.out.println("Number of Loungewear and Activewear elements found: " + loungewearAndActivewearElement.size());
                for (WebElement loungewearAndActivewear : loungewearAndActivewearElement) {
                    System.out.println(loungewearAndActivewear.getText());
                    System.out.println("Loungewear and Activewear link clicked successfully");
    }}

    public boolean ismenClothingLinkDisplayed() {
        return driver.findElement(MenClothingLink).isDisplayed();
    }

    public boolean isOptionDisplayed(String option) {
        By optionLocator = By.xpath("//div[contains(text(),'" + option + "')]");
        List<WebElement> options = driver.findElements(optionLocator);
        return !options.isEmpty() && options.get(0).isDisplayed();
    }
}