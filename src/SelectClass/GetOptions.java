package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class GetOptions extends BaseClass1{
public static void main(String[] args) throws InterruptedException {
	preCondition1();
	driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
	WebElement single_level = driver.findElement(By.id("standard_cars"));
	Select ref=new Select(single_level);
	Thread.sleep(2000);
	List<WebElement> car_product = ref.getOptions();
//	for (WebElement web : car_product) {
//		web.click();
//		Thread.sleep(1000);
//	}
	for (int i = 0; i <car_product.size(); i++) {
		car_product.get(i).click();
		Thread.sleep(2000);
	}
	ref.deselectByVisibleText("Volvo");
}
}
