import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Googletest {

	public static void main(String[] args) throws FindFailed
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/search?q=flowers&oq=flowers&aqs=chrome..69i57j0i433l4j0l3j0i10i433j0i433.3065j1j15&sourceid=chrome&ie=UTF-8");
		
	    Screen s=new Screen();
        Pattern first=new Pattern("C:\\Images\\Flowerimg.PNG");
        s.wait(first,2000); 
        
        s.click("C:\\Images\\Flowerimg.PNG");
        
        
        
        
        
	}

}
