package switchpackage;

public class switchclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	selectBrowser("chrome");
	
	}
	
	public static void selectBrowser(String name)
	{
	switch (name)
	{
	case "chrome":
	System.out.println("Chrome browser intialized seshu....");
	break;
	case "firefox":
	System.out.println("forefox browser intialized hrithik...");
	break;
	case "IE":
	System.out.println("IE browser intialized poojya....");
	break;
		
	default:
	System.out.println("Please provide valid Browser...");
		
	}

}
}
