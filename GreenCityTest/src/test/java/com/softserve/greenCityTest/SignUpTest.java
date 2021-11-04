package java.com.softserve.greenCityTest;


import com.softserve.greenCityTest.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignUpTest extends TestCase {

    private WebDriver driver;
    private SignUp signUp;

    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:/Progs/GreenCityTes/GreenCityTest/geckodriver.exe");
        driver=new FirefoxDriver();
        signUp = new SignUp(driver);
        super.setUp();
    }

    public void tearDown(){
        driver.quit();
    }

    ////Email error field check
    public void testEmailErr(){
        signUp.emptyFieldCheck();
        Assert.assertTrue(signUp.errEmail.getText().contains("Email is required"));
        System.out.println(signUp.errEmail.getText()+" :: Checked");

        signUp.errorCheck();

        String expect = "Please check that your e-mail address is indicated correctly";
        Assert.assertTrue(signUp.errEmail.getText().contains(expect));
        System.out.println(signUp.errEmail.getText()+" :: Checked");
    }

    ////User name error field check
    public void testUserNameErr(){
        signUp.emptyFieldCheck();

        Assert.assertTrue(signUp.errUserName.getText().contains("User name is required "));
        System.out.println(signUp.errUserName.getText()+" :: Checked");

        signUp.errorCheck();

        String expect="The name must contain 6-30 characters and can contain letters(a-z), numbers(0-9) and a dot(.), dot at the start, at the end and consecutive dot is forbidden ";
        Assert.assertTrue(signUp.errUserName.getText().contains(expect));
        System.out.println(signUp.errUserName.getText()+" :: Checked");
    }

    ////Password error field check
    public void testPassErr(){
        signUp.emptyFieldCheck();

        Assert.assertTrue(signUp.errPass.getText().contains("Password is required"));
        System.out.println(signUp.errPass.getText()+" :: Checked");

        signUp.errorCheck();

        String expect="Password must be at least 8 characters long";
        Assert.assertTrue(signUp.errPass.getText().contains(expect));
        System.out.println(signUp.errPass.getText()+" :: Checked");
    }

    ////Confirm password error field check
    public void testConfirmPassErr(){
        signUp.emptyFieldCheck();

        Assert.assertTrue(signUp.errConfirmPass.getText().contains("Password is required"));
        System.out.println(signUp.errConfirmPass.getText()+" :: Checked");

        signUp.errorCheck();

        String expect="Passwords do not match";
        Assert.assertTrue(signUp.errConfirmPass.getText().contains(expect));
        System.out.println(signUp.errConfirmPass.getText()+" :: Checked");
    }

    public void testSignUp() throws InterruptedException {

        signUp.setLogUp();

        Thread.sleep(2000);

        System.out.println(driver.getCurrentUrl());
        assertTrue(driver.getCurrentUrl().contains("/profile/"));
        System.out.println("User page :: Checked");
        //driver.findElement(By.cssSelector("name"));
    }

}
