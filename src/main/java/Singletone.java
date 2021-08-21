import org.openqa.selenium.WebDriver;

public class Singletone {
    private static WebDriver driver;
    private Singletone() {}
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = FactoryMethod.launchDriver();
        }
        return driver;
    }
}
