package com.excelr.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRBase {

	public static WebDriver driver;
	public static Properties prop;

	public void initialization() {
		readPropertyFile();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	public void teardown() {
		driver.close();
	}

	public void readPropertyFile() {
		prop = new Properties();
		String configFile = "./src/main/java/com/excelr/config/config.properties";
		try {
			
			FileInputStream fis = new FileInputStream(configFile);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
