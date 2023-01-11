package BaseLayer;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	protected static Properties prop;
	
	public BaseClass() {
		 prop=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//ConfigLayer//Config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//AllDrivers//chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//AllDrivers//edgedriver.exe");
			 driver=new ChromeDriver();
		}	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//	System.out.println(prop.getProperty("url"));
	//	driver.get(prop.getProperty("url"));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}
	
	

}
