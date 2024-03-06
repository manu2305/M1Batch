package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClassExplanation extends BaseClass1 {
public static void main(String[] args) {
	System.out.println("preCondition");
	preCondition2();
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println("your test case");
	 postConditionQuite();
}
}
