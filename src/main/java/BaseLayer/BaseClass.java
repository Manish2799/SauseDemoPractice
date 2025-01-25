package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertyReader;

public class BaseClass {
	public static WebDriver driver;
	public static void  intialization()
	{
		String browsername= PropertyReader.getProperty("BROWSER");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			 driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			 driver= new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("incognito"))
		{
			ChromeOptions opt= new ChromeOptions();
			
			opt.addArguments("--incognito");
			
			 driver= new ChromeDriver(opt);
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		String url=PropertyReader.getProperty("SIT_URL");
		
		driver.get(url);
	}
}
