package Basic;

public class OpenAndCLose extends BaseCLass{
public static void main(String[] args) {
	chrome();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.close();
	
}
}
