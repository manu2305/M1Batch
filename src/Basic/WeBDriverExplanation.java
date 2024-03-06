package Basic;

public class WeBDriverExplanation implements Webdriver1 {
public void getCurrentUrl() {
	System.out.println("getCurrentUrl");
}
public void close() {
	System.out.println("Close");
}
public static void main(String[] args) {
	Webdriver1 ref1=new WeBDriverExplanation();
	ref1.close();
}
}
