package pageObjects;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Base_PO {
    public Base_PO(){
    }

    public WebDriver getDriver(){
        return DriverFactory.getDriver();
    }

    public void navigateTo_URL(String url){
        getDriver().get(url);
    }

    public void clickId(String id){
        getDriver().findElement(By.id(id)).click();
    }

    public void clickXpath(String xpath){
        getDriver().findElement(By.xpath(xpath)).click();
    }

    public void selectCombo(String id, String text){
        WebElement element = getDriver().findElement(By.id(id));
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void write(String id, String textToType){
        getDriver().findElement(By.id(id)).sendKeys(textToType);
    }

    public void writexPath(String xPath, String text){
        getDriver().findElement(By.xpath(xPath)).sendKeys(text);
    }

    public void wait(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

    public void waitPresent(String xPath, int seconds){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
    }

    public void compare(String xPath, String message){
        String ActualMessage = getDriver().findElement(By.xpath(xPath)).getText();
        Assert.assertEquals(ActualMessage, message);
    }

    public void quitDriver(){
        getDriver().quit();
    }
}
