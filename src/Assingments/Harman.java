package Assingments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Harman {

	public static void main(String[] args) throws InterruptedException {
//open the browser
		WebDriver driver=new ChromeDriver();
//maximize the browser
		driver.manage().window().maximize();
//enter into Register page
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
//enter first name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harman");
		Thread.sleep(1000);
//enter last name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("preet singh");
		Thread.sleep(1000);
//Address
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Patel nagar");
		Thread.sleep(1000);
//Email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harmansaggu1994");
		Thread.sleep(1000);
		//Mobile 	
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9582794694");
		Thread.sleep(1000);
//Gender male
	 WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
	 gender.click();
	 Thread.sleep(1000);
//verifying radio button is clicked or not
	 if(gender.isSelected())
	 {
//hobbies
		 List<WebElement> hobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
//loop for click all hobby
		 for (WebElement web : hobbies)
		 {
			 web.click();
		   Thread.sleep(1000);
		  if(web.isSelected())
		   System.out.println("Hobby button is  selected");
		  else {
			  System.out.println("Hobby button is not selected");
		       }
		 }
		 }
	 else
		 System.out.println("radio button is not selected");
 
	 WebElement language = driver.findElement(By.id("msdd"));
//click language
	 language.click();
	 Thread.sleep(1000);
//select language
	 driver.findElement(By.xpath("(//div[@style='display: block;']/ul/li)[8]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//div[@style='display: block;']/ul/li)[13]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//div[@style='display: block;']/ul/li)[16]")).click();
	 Thread.sleep(1000);
	 
	 WebElement skill = driver.findElement(By.id("Skills"));
//select skills dropdown
	 Select sel= new Select(skill);
	 sel.selectByValue("Software");
	  
	 WebElement country = driver.findElement(By.id("countries"));
//select country dropdown
	 Select count = new Select(country);
	 count.selectByVisibleText("Select Country");
 //click the country dropbutton   
	 driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
	 Thread.sleep(1000);
	WebElement year = driver.findElement(By.id("yearbox"));
//select year Drop down 
	 Select select_year= new Select(year);
	 select_year.selectByValue("1995");
	 Thread.sleep(1000);
//select month Drop down
	  WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	  Select select_month= new Select(month);
	  select_month.selectByValue("August");
	  Thread.sleep(1000);
//select day Drop down
	  WebElement day = driver.findElement(By.id("daybox"));
	  Select select_day= new Select(day);
	  select_day.selectByValue("28");
	  Thread.sleep(1000);
//Enter password
	   WebElement new_pwd = driver.findElement(By.id("firstpassword"));
	  new_pwd.sendKeys("Harmansaggu@2808");
//get the value which we passed
	  String new_pwd_store = new_pwd.getAttribute("value");
	  System.out.println(new_pwd_store);
	   Thread.sleep(1000);
	  WebElement cnf_pwd = driver.findElement(By.id("secondpassword"));
//enter Confirm password
	  cnf_pwd.sendKeys("Harmansaggu@2808");
//get the value which we passed
	  String cnf_pwd_store = cnf_pwd.getAttribute("value");
	  System.out.println(cnf_pwd_store);
//verify password and confirm password is equal	  
	  if(new_pwd_store.equals(cnf_pwd_store))
	  {
		  System.out.println("submit button clicked");
		  WebElement submit = driver.findElement(By.id("submitbtn"));
//verify that submit button is enabled or not
		  if(submit.isEnabled())
		  {
			  System.out.println("submit button is enabled");
			  //submit.click();
		  }
		  else
			  System.out.println("submit button is not enabled");
	  }
	  else
		  System.out.println("not equal");
	}
	}

