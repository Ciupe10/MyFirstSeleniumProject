import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        LoginTest loginTest = new LoginTest();
        loginTest.loginTest();


    }


    public void loginTest(){

//  Adăugați în clasa LoginTest un test în care să automatizați pașii necesari pentru logarea cu succes a unui utilizator.

        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();


    }
}
