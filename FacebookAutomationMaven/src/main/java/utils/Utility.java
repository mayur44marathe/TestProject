package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

//	public static void capturescreenshot () throws InterruptedException, IOException {
//		
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
//			
//			driver.manage().window().maximize();
//			
//			Thread.sleep(3000);
//			
//			driver.get("https://paytm.com/");
//			
//			Thread.sleep(3000);
//			
//			TakesScreenshot t = (TakesScreenshot)driver;
//			
//			File	src = t.getScreenshotAs(OutputType.FILE);
//			
//			File dest = new File ("C:\\Users\\hp\\Desktop\\Software Testing\\Uddesh178.png");
//			
//
//			FileHandler.copy(src, dest);
//			 
//	}
//			
//			
//		public static void getDataFromExcel () {
//			
//			String data = "C:\\Users\\hp\\Desktop\\Book1.xlsx";
//			
//			try {
//				date = getStringCellValue ();
//			}
			
	public static String fetchDataFromExcelSheet (String Sheet, int row, int column, Object WorkbookFactory) {
	return null;
	
	String path = "C:\\Users\\hp\\Desktop\\Book1.xlsx";
	
	FileInputStream file = new FileInputStream (path);
	
	//String Data = WorkbookFactory.create(file).getsheet(sheet).get
	
	String Data = WorkbookFactory.create(file).getSheet("Sheet").getRow(3).getCell(2).getStringCellValue();

	return Data;
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
