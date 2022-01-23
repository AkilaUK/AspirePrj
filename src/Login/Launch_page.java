package Login;
//import Inventory.PageValidation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Launch_page {
	
	public WebDriver driver;
	
	@Test
	public void TC1() {
		 
		String URL = "https://aspireapp.odoo.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akila Adithya\\eclipse-workspace\\Aspire1\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get(URL);
		
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle,"Odoo");
	}
	
	@Test
	public void TC2(){
		
		try {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/button"));
		WebElement ResetPwd = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/div[1]/a"));
		WebElement PoweredByOdoo = driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/div[2]/a"));
		}catch (NoSuchElementException e) {
			System.out.println("Element Not available");
		}
		}
	
	@Test
	public void TC3() throws InterruptedException {
		
		
		String Email = "user@aspireapp.com";
		String Password = "@sp1r3app";
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/button")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void TC4() throws InterruptedException{
				
	try {
			WebElement BarCode = driver.findElement(By.xpath("//*[@id=\"result_app_3\"]/div[1]"));
			WebElement Manufacturing = driver.findElement(By.xpath("//*[@id=\"result_app_2\"]/div[1]"));
			WebElement Discuss = driver.findElement(By.xpath("//*[@id=\"result_app_0\"]/div[1]"));
			WebElement Inventory = driver.findElement(By.xpath("//*[@id=\"result_app_1\"]/div[1]"));
			Inventory.click();
			
		}catch (NoSuchElementException e) {
			System.out.println("Element not found");
		}
		
		Thread.sleep(2000);
	}
	
	@Test
	public void TC5() throws InterruptedException{
		
		WebElement Product = driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[3]/a"));
		Product.click();
		WebElement ProductDrpDwn = driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[3]/div/a[1]/span"));
		ProductDrpDwn.click();
		Thread.sleep(2000);
	}
	
	@Test
	public void TC6() throws InterruptedException{
		
		WebElement CreateProd = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div[1]/div/div/button"));
		CreateProd.click();
		
		Thread.sleep(2000);
		String ProductName = "Aspire1005";
		WebElement EnterProdName = driver.findElement(By.xpath("//*[@id=\"o_field_input_736\"]"));
		EnterProdName.sendKeys(ProductName);
		WebElement ProdSave = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]"));
		ProdSave.click();
		
		Thread.sleep(2000);
		
		WebElement UpdateQty = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div[1]/div/button[2]/span"));
		UpdateQty.click();
		
		Thread.sleep(2000);
		WebElement UpdateQtyCreate = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div[1]/div/div/button[3]"));
		UpdateQtyCreate.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/div/input")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/div/div/input")).sendKeys(Keys.RETURN);
		
		
		Thread.sleep(2000);

		//driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[3]/div/div/input")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[3]/div/div/input")).sendKeys("1");
		
		WebElement Qty = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]/input"));
		Qty.clear();
		Qty.sendKeys("10");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div[1]/div/div/button[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement AppMenu = driver.findElement(By.xpath("/html/body/header/nav/a[1]"));
		AppMenu.click();
		
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.stalenessOf(Manufacturing));
		driver.findElement(By.xpath("//*[@id=\"result_app_2\"]/div[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement CreateManufacturingItem = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[2]/div[1]/div/div/button[3]"));
		CreateManufacturingItem.click();

		Thread.sleep(2000);
		WebElement Mfg_Product = driver.findElement(By.xpath("//*[@id=\"o_field_input_927\"]"));
		//Mfg_Product.clear();
		Mfg_Product.sendKeys("Aspire1005");
		//Mfg_Product.sendKeys(Keys.DOWN);
		Mfg_Product.sendKeys(Keys.ENTER);
		
		WebElement Mfg_Qty = driver.findElement(By.xpath("//*[@id=\"o_field_input_929\"]"));
		Mfg_Qty.clear();
		Mfg_Qty.sendKeys("2");
		
		/*WebElement Mfg_Qty_Val = driver.findElement(By.xpath("//*[@id=\"o_field_input_930\"]"));
		Mfg_Qty_Val.sendKeys("Dozen");
		Mfg_Qty_Val.sendKeys(Keys.DOWN);
		Mfg_Qty_Val.sendKeys(Keys.RETURN);*/
		
		WebElement Mfg_AddALine = driver.findElement(By.xpath("//*[@id=\"o_field_input_960\"]/div[2]/div/table/tbody/tr[1]/td/a"));
		Mfg_AddALine.click();
		
		Thread.sleep(2000);
		
		WebElement Mfg_AddALine_Prod = driver.findElement(By.xpath("//*[@id=\"o_field_input_960\"]/div[2]/div/table/tbody/tr[1]/td[1]/div/div/input"));
		//Mfg_AddALine_Prod.clear();
		Mfg_AddALine_Prod.sendKeys("Aspire1005");
		//Mfg_AddALine_Prod.sendKeys(Keys.DOWN);
		Mfg_AddALine_Prod.sendKeys(Keys.ENTER);
		
		WebElement Mfg_AddALine_ToConsume = driver.findElement(By.xpath("//*[@id=\"o_field_input_960\"]/div[2]/div/table/tbody/tr[1]/td[2]/input"));
		Mfg_AddALine_ToConsume.clear();
		Mfg_AddALine_ToConsume.sendKeys("2");
		
		/*WebElement Mfg_AddALine_UnitOfMeasure = driver.findElement(By.xpath("//*[@id=\"o_field_input_960\"]/div[2]/div/table/tbody/tr[1]/td[3]/div/div/input"));
		Mfg_AddALine_UnitOfMeasure.sendKeys("Dozen");
		Mfg_AddALine_UnitOfMeasure.sendKeys(Keys.DOWN);
		Mfg_AddALine_UnitOfMeasure.sendKeys(Keys.RETURN);
		*/
		
		
		WebElement Mfg_Confirm = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div[1]/div[1]/button[3]/span"));
		Mfg_Confirm.click();
		
		
		WebElement Mfg_Save = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[1]"));
		Mfg_Save.click();
		
				
		WebElement Mfg_MarkAsDone = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div[1]/div[1]/button[2]/span"));
		Mfg_MarkAsDone.click();
		
			
		
		
		//driver.close();
	}


}
