package com.cheap.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(String browser)
	{
		switch(browser)
		{

			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Browser not valid");
		}
	}
	public static void loadUrl(String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public static void ClickElement(WebElement element)
	{
		element.click();
	}
	public static void Input(WebElement element, String data)
	{
		element.clear();
		element.sendKeys(data);
	}
	public static void SelectVisible(WebElement element, String drop)
	{
		Select visible= new Select(element);
		visible.selectByVisibleText(drop);
	}
	public static void wait(int milliseconds) throws InterruptedException
	{
		Thread.sleep(milliseconds);
	}
	public static void waitTillElement(By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement elementFound=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static void WaitTillInvisible(String data)
	{
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(data)));
        //Boolean element3 = wait.until(ExpectedConditions.invisibilityOf(element2)));

	}
	public static String PageURL()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	public static String getCellType(String Sheet,int rowNum, int colNum)
	{
		String res=null;
		File F=new File("src\\test\\resources\\TestData\\Hotel_Inputs.xlsx");
		try
		{
			FileInputStream fis=new FileInputStream(F);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sheet=wb.getSheet(Sheet);
			Row row=sheet.getRow(rowNum);
			Cell cell=row.getCell(colNum);
			int cellType=cell.getCellType();
			if(cellType==1)
			{
				res=cell.getStringCellValue();
			}
			else if(cellType==0)
			{
				if(DateUtil.isCellDateFormatted(cell))
				{
					Date dateCellValue=cell.getDateCellValue();
					SimpleDateFormat sm=new SimpleDateFormat("dd/mm/yy");
					res=sm.format(dateCellValue);
				}
				else
				{
					double numericCellValue=cell.getNumericCellValue();
					long l=(long)numericCellValue;
					res=String.valueOf(l);
				}
			}
		}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		return res;
	}
	public static String read_props(String key)
	{
		String propvalue=null;
		try
		{
			FileReader fileRead= new FileReader(new File("src\\test\\resources\\TestData\\resource.properties"));
			Properties prop=new Properties();
			prop.load(fileRead);
			propvalue=prop.getProperty(key);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		return propvalue;
		
	}
	public static String Title()
	{
		String title=driver.getTitle();
		return title;
	}
	public static WebElement ById(String id)
	{
		return driver.findElement(By.id(id));
	}
	public static WebElement ByXpath(String Xpath)
	{
		return driver.findElement(By.xpath(Xpath));
	}
	public static String cls(WebElement element)
	{
		return element.getAttribute("class");
	}
	public static void Clickactions(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	public static boolean Selected(WebElement element)
	{
		return element.isSelected();
	}
	public static WebElement Active()
	{
		return (driver.switchTo().activeElement());
	}
	
	public static void selectAll(WebElement element)
	{
	    String selectAll = Keys.chord(Keys.CONTROL, "a");
	    element.sendKeys(selectAll);
	}
	public static void Delete(WebElement element)
	{
		element.sendKeys(Keys.DELETE);
	}
	public static void InputJS(WebElement element,String Data)
	{		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '" + Data + "';", element);
		try {
			BaseClass.wait(500); // Wait 500 milliseconds (adjust as needed)
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Wait interrupted.");
		}
	}
	public static void trigger(WebElement element)
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", element);
		
		
	}
	public static void Enter(WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	public static void ClickJs(WebElement element)
	{
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		
	}
}
