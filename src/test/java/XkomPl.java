import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;
public class XkomPl {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @Test
    public void checkIfPageIsCorrect() throws Exception {
        String baseUrl = "https://www.x-kom.pl/";

        driver.get(baseUrl);
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#searchBar > div.search-bar > div.search-text > input")).sendKeys("ASUS WT465");

        driver.findElement(By.cssSelector("#searchBar > div.search-bar > div.search-text > input")).submit();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#productList > div:nth-child(1)")).submit();

        driver.findElement(By.cssSelector("#jsInfoBoxContainer > div.product-infobox > p > button")).submit();

        driver.findElement(By.cssSelector("#basketWidget > div.heading > a > div.name.basket-status")).submit();

        assertThat(driver.findElement(By.id("basketWidget"))).isEqualTo("59,00");

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}


