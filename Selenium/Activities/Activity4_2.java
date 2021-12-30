package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Rama");
        lastName.sendKeys("Raju");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test1@abc.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//textarea")).sendKeys("Input field");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}