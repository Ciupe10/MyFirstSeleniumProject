import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void loginTest(){

//  Adăugați în clasa LoginTest un test în care să automatizați pașii necesari pentru logarea cu succes a unui utilizator.


        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title *='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement helloMessage = driver.findElement(By.cssSelector(".hello"));
        Assert.assertTrue(helloMessage.isDisplayed());


    }

    @Test
    public void loginTestTwo() {
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title *='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement helloMessage = driver.findElement(By.cssSelector(".hello"));
        Assert.assertTrue(helloMessage.isDisplayed());

        Assert.assertEquals("Hello, Mihai Geo Ciupe!",helloMessage.getText());
    }

    @Test
    public void loginInvalidEmail() {
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title *='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement helloMessage = driver.findElement(By.cssSelector(".hello"));
        Assert.assertTrue(helloMessage.isDisplayed());

        Assert.assertEquals("Hello, Mihai Geo Ciupe!",helloMessage.getText());
    }

    @Test
    public void loginInvalidPassword() {
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title *='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola11");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement helloMessage = driver.findElement(By.cssSelector(".hello"));
        Assert.assertTrue(helloMessage.isDisplayed());

        Assert.assertEquals("Hello, Mihai Geo Ciupe!",helloMessage.getText());
    }

    @Test
    public void loginInvalidTextInExpected() {
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title *='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola.11");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement helloMessage = driver.findElement(By.cssSelector(".hello"));
        Assert.assertTrue(helloMessage.isDisplayed());

        Assert.assertEquals("HelloMihai Geo Ciupe!",helloMessage.getText());
    }

    @Test
    public void loginInvalidPasswordAndInvalidErrorMessge() {
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title *='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ciupe_mihai10@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Parola11");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector(".error-msg"));

        Assert.assertEquals("Invalid login or password.",errorMessage.getText());
    }





    @After
    public void closeDriver (){
        driver.close();
    }
}
