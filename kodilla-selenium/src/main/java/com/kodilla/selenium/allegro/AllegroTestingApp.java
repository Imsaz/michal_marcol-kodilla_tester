package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\windows\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        //WebElement inputField = driver.findElement(By.name("string"));
        //inputField.sendKeys("Mavic mini");

        //Alert alert = driver.switchTo().alert();
        //alert.accept();

        //WebElement typeThing = driver.findElement(By.xpath("//*[contains(@aria-label=\"Kategorie i opcje\"]/optgroup)"));
       // Select categorySelect = new Select(typeThing);
       // categorySelect.selectByIndex(0);
    }
}
