import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel\\IdeaProjects\\SeleniumJenkinsDemo\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Tytuł strony: " + driver.getTitle());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
