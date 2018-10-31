import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;
public class PracujPlTests {
    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void checkIfPracujPlTitleIsCorrect(){
        String actualTitle = "";
        String expectedTitle = "Oferty pracy - Pracuj.pl";
        String baseUrl = "https://www.pracuj.pl";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
    @Test
    public void checkHowManyOffersAreAvailable(){
        String baseUrl = "https://www.pracuj.pl";
        driver.get(baseUrl);
        driver.findElement(By.id("keywords")).sendKeys("tester oprogramowania");
        driver.findElement(By.id("location")).sendKeys("pomorskie");
        driver.findElement(By.id("searchBtn")).submit();
        System.out.println(driver.findElement(By.className("o__search_results_title_number")).getText());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
