import org.openqa.selenium.WebDriver;

public class AbstractFactory {
    public static WebDriver createWebDriverForFirefox() {
        return (WebDriver) new FirefoxLauncher();
    }

    public static WebDriver createWebDriverForChrome() {
        return (WebDriver) new ChromeLauncher();
    }
}
