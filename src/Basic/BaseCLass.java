package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseCLass {
	public static WebDriver driver;
public static void chrome() {
	driver=new ChromeDriver();
}
public static void edge() {
	driver=new EdgeDriver();
}
public static void firefox() {
	driver=new FirefoxDriver();
}
public static void iE() {
	driver=new InternetExplorerDriver();
}
}
