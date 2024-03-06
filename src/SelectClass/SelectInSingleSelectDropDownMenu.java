package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class SelectInSingleSelectDropDownMenu extends BaseClass1 {
public static void main(String[] args) throws InterruptedException {
	preCondition1();
	driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
	WebElement single_level = driver.findElement(By.id("standard_cars"));
	Select ref=new Select(single_level);
	Thread.sleep(2000);
	ref.selectByValue("lr");
	Thread.sleep(2000);
	ref.selectByVisibleText("Ford");
	Thread.sleep(2000);
	ref.selectByIndex(0);
	Thread.sleep(3000);
	postConditionClose();

}
}
