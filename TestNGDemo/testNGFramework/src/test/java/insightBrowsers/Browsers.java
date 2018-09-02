package insightBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import variables.InsightConstants;

public class Browsers {

	public static void launchBrowser()
	{
		try {
			if(variables.InsightConstants.browserName.toUpperCase()=="CHROME")
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("--disable-infobars");
				
				System.setProperty("webdriver.driver.chrome", "G:\\Selenium\\Drivers\\chromedriver.exe");
				InsightConstants.driver=new ChromeDriver();
				
				InsightConstants.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				InsightConstants.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
				InsightConstants.driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured while initializing the "+InsightConstants.browserName+" browser. Refer below exception stack trace");
			ex.printStackTrace();
		}
	}
}
