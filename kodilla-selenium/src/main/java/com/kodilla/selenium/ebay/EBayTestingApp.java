package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\windows\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driverEBay = new ChromeDriver();
        driverEBay.get("https://www.ebay.pl/");
        WebElement inputField = driverEBay.findElement(By.name("_nkw"));
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
