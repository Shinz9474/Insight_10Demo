package testcases;

import java.io.IOException;

import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

public class TestCase {

	@BeforeTest
	public void testInitialization() throws IOException
	{
		variables.InsightConstants.browserName="Chrome";
		variables.InsightConstants.osName="Windows";
		TestInitialization.TestInitializer.readGlobalConfigData();
		
		System.out.println("Variables initialized..");
	}
	
	@Test
	public void executeTestCase()
	{		
		variables.InsightConstants.browserName="Chrome";
		insightBrowsers.Browsers.launchBrowser();
	}
	
	@AfterTest
	public void testCleanUp()
	{
		//Quit browser using shellcommand
		
	}
}
