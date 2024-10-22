package Code.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//handle link , radiobutton , checkbox, buttons
public class handlebasicHTMLelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindixheckbox = driver.findElement(By.id("hindichbx"));
		hindixheckbox.click();
		Thread.sleep(3000);
		if(hindixheckbox.isSelected()) {
			hindixheckbox.click();
			Thread.sleep(3000);
			}
		driver.findElement(By.id("registerbtn"));
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		

	}

}
