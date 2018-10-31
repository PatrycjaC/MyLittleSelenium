import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;
public class CodementorsPlTests {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

        @Test
        public void checkIfPageIsCorrect() throws Exception {
            String baseUrl = "https://codementors.pl/";

            driver.get(baseUrl);
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("#menu > li:nth-child(8) > a")).click();

            Thread.sleep(5000);

            System.out.println(driver.findElement(By.cssSelector("body > div:nth-child(4) > div > section.contact-area.fix > div > div > div:nth-child(2) > div > div:nth-child(1) > h4")));
            driver.findElement(By.cssSelector("body > div:nth-child(4) > div > section.contact-area.fix > div > div > div:nth-child(2) > div > div:nth-child(3) > p"));

            driver.findElement(By.cssSelector("body > div:nth-child(4) > div > section.contact-area.fix > div > div > div:nth-child(2) > div > div:nth-child(3) > h4"));

        }

    @After
    public void tearDown(){
        driver.quit();
    }
}
