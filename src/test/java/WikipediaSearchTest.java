import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WikipediaSearchTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel\\IdeaProjects\\SeleniumJenkinsDemo\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Description("Sprawdza wyszukiwanie w Wikipedii")
    @Test
    public void searchWikipediaForSelenium() {
        driver.get("https://www.wikipedia.org");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Wikipedia"));

        WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("searchInput")));
        searchInput.sendKeys("Selenium (software)");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));

//        String expectedTitle = "Selenium (software) - Wikipedia";
        String actualTitle = driver.getTitle();

        assertTrue(actualTitle.contains("Selenium"));
    }


    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
