import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;
public class IntelTests {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\student\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @Test
    public void checkIfPageIsCorrect() throws Exception {
        String baseUrl = "https://www.google.com/";

        driver.get(baseUrl);
        Thread.sleep(5000);

        driver.findElement(By.id("lst-ib")).sendKeys("Intel Gdańsk");

        driver.findElement(By.id("lst-ib")).submit();

        Thread.sleep(5000);

        System.out.println(driver.findElement(By.cssSelector("#rhs_block > div > div.kp-blk.knowledge-panel.Wnoohf.OJXvsb > div > div.ifM9O > div:nth-child(2) > div.SALvLe.farUxc.mJ2Mod > div > div:nth-child(2)")).getText());

        System.out.println(driver.findElement(By.cssSelector("#rhs_block > div > div.kp-blk.knowledge-panel.Wnoohf.OJXvsb > div > div.ifM9O > div:nth-child(2) > div.SALvLe.farUxc.mJ2Mod > div > div:nth-child(4)")).getText());

        System.out.println(driver.findElement(By.cssSelector("#rhs_block > div > div.kp-blk.knowledge-panel.Wnoohf.OJXvsb > div > div.ifM9O > div:nth-child(2) > div:nth-child(8) > div:nth-child(2) > div.RkBmNb > span > span > a")).getText());

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}

