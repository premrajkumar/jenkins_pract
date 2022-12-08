package jenkins_practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JenkinsParameters {
	@Test
	public void main3()
	{
		String browser = System.getProperty("ky");
		String url = System.getProperty("ul");
		System.out.println(browser);
		System.out.println(url);
//		WebDriver driver = new Webdriverutility().openBrowser(browser);
//		new Webdriverutility().navigateToApplication(driver, url);
	}

}
