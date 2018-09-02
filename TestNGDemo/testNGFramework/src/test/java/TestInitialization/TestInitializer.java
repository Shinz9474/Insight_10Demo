package TestInitialization;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestInitializer {
	
	public static void readGlobalConfigData() throws IOException {
		
		Properties properties = new Properties();
		
		InputStream file = TestInitializer.class.getClassLoader().getResourceAsStream("src/test/java/configResource/GlobalConfig.properties");
		properties.load(file);
		
		variables.InsightConstants.browserName = properties.getProperty("browserName");
	}

}
