import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FactoryMethod {
        public static final String CHROME_NAME = "Chrome";
        public static final String WEBDRIVER_TYPE = PropertyHelper.getProperty("driver");

        static WebDriver launchDriver() {
            WebDriver driver;
            if (WEBDRIVER_TYPE.equalsIgnoreCase(CHROME_NAME)) {
                driver = ChromeLauncher.createDriver();
            } else {
                driver = FirefoxLauncher.createDriver();
            }
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            return driver;
        }
}
