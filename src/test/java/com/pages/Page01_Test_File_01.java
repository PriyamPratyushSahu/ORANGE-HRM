package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class Page01_Test_File_01 {
	
WebDriver driver;
ArrayList<String> tabs;
JavascriptExecutor js;
Properties prop;
FileInputStream fs;
File fetch_file;
FileInputStream excel_file;
XSSFWorkbook work_file;
XSSFSheet sheet;

	public Page01_Test_File_01(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void waitTime(int n)
	{
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void one_property_file_is_loaded() throws IOException {
		
		  prop = new Properties(); fs = new FileInputStream(
		  "src\\test\\resources\\Properties\\Property01_Test_File_01.properties");
		  prop.load(fs);
		 
		  fetch_file = new File("src\\test\\resources\\Excel Files\\All_Excel_Files.xlsx");
			excel_file = new FileInputStream(fetch_file);
			work_file = new XSSFWorkbook(excel_file);
			sheet = work_file.getSheet("Login_Sheet");
			
		System.out.println("One_Property File is loaded");
	}
	
	public void one_directed_to_the_site() throws IOException {
		 driver.get(" https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		  waitTime(3000);
		System.out.println("Checked site");
	}
	
	public void one_enter_the_user_name() throws IOException {
		WebElement user_name = driver.findElement(By.xpath(prop.getProperty("user_name")));
		user_name.clear();
		user_name.sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		waitTime(2000);
	    System.out.println("Entered User Name");
	    
	}
	
	public void one_enter_the_password() throws IOException {
		WebElement password = driver.findElement(By.xpath(prop.getProperty("password")));
		password.clear();
		password.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		waitTime(2000);
	    System.out.println("Entered Password");
	    
	}

	public void one_click_on_login() throws IOException {
		WebElement login_button = driver.findElement(By.xpath(prop.getProperty("login_button")));
		login_button.click();
		waitTime(2000);
	    System.out.println("Click on Login");
	}
	
	public void one_log_out() throws IOException	{
		WebElement  welcome_dropdown = driver.findElement(By.xpath(prop.getProperty("Welcome_dropdown")));
		welcome_dropdown.click();
		waitTime(3000);
		WebElement logout_option = driver.findElement(By.xpath(prop.getProperty("Logout_option")));
		logout_option.click();
		waitTime(2000);
		System.out.println("Logged out");
	}
	
	public void one_enter_the_invalid_user_name() throws IOException {
		WebElement user_name = driver.findElement(By.xpath(prop.getProperty("user_name")));
		user_name.clear();
		user_name.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
		waitTime(2000);
		System.out.println("Invalid user name entered");
	    
	}

	public void one_enter_the_invalid_password() throws IOException {
		WebElement password = driver.findElement(By.xpath(prop.getProperty("password")));
		password.clear();
		password.sendKeys(sheet.getRow(1).getCell(3).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());
		waitTime(2000);
		System.out.println("Invalid password entered");
	}
	public void one_click_on_forgot_your_password() throws IOException	{
		WebElement forgot_password = driver.findElement(By.xpath(prop.getProperty("forgot_password")));
		
		forgot_password.click();
		waitTime(2000);
		
		WebElement input_username = driver.findElement(By.xpath(prop.getProperty("input_username")));
		WebElement reset_password = driver.findElement(By.xpath(prop.getProperty("reset_password")));
		
		input_username.clear();
		input_username.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
		waitTime(2000);		
		
		reset_password.click();
		waitTime(2000);
		WebElement cancel_button = driver.findElement(By.xpath(prop.getProperty("cancel_button")));
		cancel_button.click();
		waitTime(2000);
		System.out.println("Clicked on forgot password");
	
	}
}