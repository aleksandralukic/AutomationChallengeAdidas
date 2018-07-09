package adidas;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdidasAutomationTest {
	@Test 
	public void SendCommentTest() {

				System.setProperty("webdriver.chrome.driver","/Users/aleksandralukic/chromedriver");
				WebDriver driver = new ChromeDriver();
				String commentTextActual = "Sending a comment with a correct email in testing purposes";
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get("http://store.demoqa.com/");
				driver.findElement(By.id("menu-item-54")).click();
				driver.findElement(By.id("comment")).sendKeys("I am going to send a comment with wrong email");
				driver.findElement(By.id("author")).sendKeys("Aleksandra");
				driver.findElement(By.id("email")).sendKeys("testmailwrong.com");
				driver.findElement(By.id("submit")).click();
				if(driver.findElement(By.id("error-page")).isDisplayed()) {
					System.out.println("Error is displayed");
				}
				else {
					System.out.println("Error is not displayed");
				}
				driver.findElement(By.tagName("a")).click();
				driver.findElement(By.id("menu-item-54")).click();
				driver.findElement(By.id("comment")).sendKeys(commentTextActual);
				driver.findElement(By.id("author")).sendKeys("Aleksandra");
				driver.findElement(By.id("email")).sendKeys("a.lukic@piratetech.com");
				driver.findElement(By.id("submit")).click();
				WebElement commentBody = driver.findElement(By.className("commentlist"));
				String commentText = commentBody.getText();
				if(commentText.contains(commentTextActual))
					System.out.println("Comment succesfully submited");
				else {
					System.out.println("Comment is not submitted");
				}
				driver.close();
				
				
	}
}
