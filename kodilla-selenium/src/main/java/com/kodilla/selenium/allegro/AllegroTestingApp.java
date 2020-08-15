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

        Thread.sleep(2000);
        //WebElement closeField = driver.findElement(By.xpath("//html/body/div/div/div/div/div/button"));
        WebElement closeField = driver.findElement(By.xpath("//*[@type=\"button\" and @data-role=\"close-and-accept-consent\"]"));
        closeField.click();

        //closeField = driver.findElement(By.xpath("//html/body/div[2]/div[2]/header/div/div/div/div/form/div[2]/div/select"));
        closeField = driver.findElement(By.xpath("//select[contains(@class,\"mr3m_1 m7er_k4\") and contains(@data-role,\"filters-dropdown\") and contains(@aria-label,\"Kategoria\")]"));
        Select categorySelect = new Select(closeField);
        categorySelect.selectByIndex(3);
        Thread.sleep(2000);

        //closeField = driver.findElement(By.xpath("//html/body/div[2]/div[2]/header/div/div/div/div/form/input"));
        closeField = driver.findElement(By.xpath("//input[@type=\"search\" and contains(@autocomplete, \"f\") and @name=\"string\" and @role=\"combobox\"]"));
        closeField.sendKeys("Mavic mini");
        closeField.submit();
    }
}
