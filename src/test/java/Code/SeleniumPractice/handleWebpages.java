package Code.SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//handle textbox
public class handleWebpages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		if(usernameTxt.isDisplayed()) {
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("david");
				String enteredtxt = usernameTxt.getAttribute("value");
				System.out.println(enteredtxt);
				Thread.sleep(3000);
				usernameTxt.clear();				
			}else {
				System.err.println("Ussr name textbox is not enabled");
			}
			
			
		}else {
			System.err.println("user name textbox is not displayed");
		}

	}

}
