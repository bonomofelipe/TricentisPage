package stepDefinitions.base;



import static driver.DriverFactory.getDriver;

public class Hooks {

    public void setup(){
        getDriver();
    }
}
