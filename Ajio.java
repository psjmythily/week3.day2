package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	
	/*
	 * 1. Launch the URL https://www.ajio.com/
	 *  2. In the search box, type as "bags" and press enter 
	 * 3. To the left of the screen under " Gender" click the "Men"
	 * 4. Under "Category" click "Fashion Bags"
	 * 5. Print the count of the items Found. 
	 * 6. Get the list of brand of the products displayed in the page and print the list.
	 *  7. Get the list of names of the bags and print it
	 */

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// To Download and set the path 
		WebDriverManager.chromedriver().setup();
				
		// To Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
				
		//To Launch the URL
		driver.get("https://www.ajio.com/");
				
		//To Maximise the window
		driver.manage().window().maximize();
		
		//To add implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("Bags" , Keys.ENTER);
		
		//To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		// Under "Category" click "Fashion Bags"
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		//Print the count of the items Found. 
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("Total no.of items : " + text);
		
		//Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		
		List<WebElement> brandname = driver.findElements(By.className("brand"));
		
	    System.out.println(" Size :" + brandname.size());
		
		for(WebElement elements : brandname)
		{
			System.out.println(elements.getText());
		}
		
		//Get the list of names of the bags and print it
		System.out.println(" List of Bags");
		
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println(" Size :" + bags.size());
		
		for(WebElement elements : bags)
		{
			System.out.println(elements.getText());
		}

	}

}
