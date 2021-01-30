import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    private WebDriver driver;

    @Before
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");


    }

//  Adăugați în clasa RegisterTest un test(o noua metoda) în care să automatizați pașii necesari pentru
//  înregistrarea cu succes a unui utilizator nou (deschideți homepage-ul, apăsați pe Account, apăsați pe
//  Register, completați toate câmpurile de pe pagina Register - atenție ca email-ul să fie unic, bifați opțiunea
//  pentru primirea newsleterr-ului). Folosiți identificatori diferiți pentru câmpurile de pe pagina Register
//  (id, name, className). Pe viitor, după învățarea altor identificatori, veți reveni pentru a apăsa și butonul Register.
//  Apelati metoda aceasta in metoda main din clasa pentru a rula testul.

    @Test
    public void registerTest(){


        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("George");
        driver.findElement(By.name("middlename")).sendKeys("Mihai");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Jon");
        driver.findElement(By.id("email_address")).sendKeys("ciupemihai9@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Parola.11");
        driver.findElement(By.name("confirmation")).sendKeys("Parola.11");
        driver.findElement(By.className("checkbox")).click();


    }

    @After
    public void closeTest(){
        driver.quit();
    }
}
