package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class MultiSelect extends BaseClass1 {
public static void main(String[] args) {
	preCondition1();
	driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
	WebElement multi_level = driver.findElement(By.id("multiple_cars"));
	Select ref=new Select(multi_level);
	if(ref.isMultiple()) {
      List<WebElement> car_product = ref.getOptions();
      for (WebElement web : car_product) {
		web.click();
	}
      }
	else {
		System.out.println("you are trying to perform on single_level drop down menu ");
	}
}
}
