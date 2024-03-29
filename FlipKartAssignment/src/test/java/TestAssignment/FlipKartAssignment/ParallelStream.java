package TestAssignment.FlipKartAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {	
	public static void main(String[] args) 	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();		
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
	List<String> allLinksHrefs = allLinks.parallelStream()				
			.map(link -> link.getAttribute("href")) 
			.collect(Collectors.toList());				
	allLinksHrefs.forEach(System.out::println);				
	driver.quit();	
	}
	}
