package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\windows\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Thread.sleep(2000);
        //WebElement closeField = driver.findElement(By.xpath("//html/body/div/div/div/div/div/button"));
        //WebElement operator = driver.findElement(By.xpath("//*[@type=\"button\" and @data-role=\"close-and-accept-consent\"]"));
        WebElement operator = driver.findElement(By.cssSelector("div>button[class*='_13q9y _8hkto m0t1_f9 mg9e_0'] >img[class='_nem5f']"));
        operator.click();

        //closeField = driver.findElement(By.xpath("//html/body/div[2]/div[2]/header/div/div/div/div/form/div[2]/div/select"));
        //operator = driver.findElement(By.xpath("//select[contains(@class,\"mr3m_1 m7er_k4\") and contains(@data-role,\"filters-dropdown\") and contains(@aria-label,\"Kategoria\")]"));
        operator = driver.findElement(By.cssSelector("div>select[class*='mr3m_1']"));
        Select categorySelect = new Select(operator);
        categorySelect.selectByIndex(3);
        Thread.sleep(2000);

        //closeField = driver.findElement(By.xpath("//html/body/div[2]/div[2]/header/div/div/div/div/form/input"));
        //operator = driver.findElement(By.xpath("//input[@type=\"search\" and contains(@autocomplete, \"f\") and @name=\"string\" and @role=\"combobox\"]"));
        operator = driver.findElement(By.cssSelector("div>form>input"));
        operator.sendKeys("Mavic mini");
        operator.submit();

        List<WebElement> operatorList = driver.findElements(By.cssSelector("section>article"));
        for(WebElement element : operatorList){
            System.out.println(element.getText());
        }

    }
}
