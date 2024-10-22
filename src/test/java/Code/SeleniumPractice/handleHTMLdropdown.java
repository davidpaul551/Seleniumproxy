package Code.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//handle link , radiobutton , checkbox, buttons
public class handleHTMLdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		//SINGLE SELECTION DROPDOWN
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select courseNameDropdown = new Select(courseElement);
//		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
//		for(WebElement option :courseNameDropdownOptions) {
//			System.out.println(option.getText());
//		}
//		courseNameDropdown.selectByIndex(1);
//		Thread.sleep(3000);
//		courseNameDropdown.selectByValue("net");
//		Thread.sleep(3000);
//		courseNameDropdown.selectByVisibleText("Javascript");
//		Thread.sleep(3000);
//		String SelectedText = courseNameDropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected Visible Text : "+SelectedText);
		
		
		
		//MULTI SELECTION  DROPDOWN OPTIONS
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for(WebElement option :ideDropdownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);//Eclipse
		Thread.sleep(3000);
		ideDropdown.selectByValue("ij");//Intelli j
		Thread.sleep(3000);
		ideDropdown.selectByVisibleText("Visual Studio");
		Thread.sleep(3000);
		ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		
		
		
		List<WebElement> SelectedOptions = ideDropdown.getAllSelectedOptions();
		System.out.println("Selected Visible Text : "+SelectedOptions);
		
		
		
		
		
		

	}

}
