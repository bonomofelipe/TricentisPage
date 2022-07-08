package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }

    public static WebDriver createDriver() {
        WebDriver driver = null;
        String browserType = "chrome";

        switch (browserType) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void killDriver() {
        webDriver.get().quit();
    }

}
