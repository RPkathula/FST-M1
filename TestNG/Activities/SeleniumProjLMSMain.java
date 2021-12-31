package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumProjLMSMain {
	
	private static final WebElement Null = null;
	WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyTitle() {
    	
    	String Title = driver.getTitle();
        
        Assert.assertEquals("Alchemy LMS � An LMS Application", Title);
    }
    
    @Test
    public void verifyHeading() {
    	
    	String heading = driver.findElement(By.xpath("//h1")).getText();
    	
    	Assert.assertEquals("Learn from Industry Experts", heading);
    	
    }
    
    @Test
    public void verifyFirstInfoBoxTitle() {
    	
    	String firstInfoBoxTitle = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]")).getText();
    	
    	Assert.assertEquals("Actionable Training", firstInfoBoxTitle);
    }
    
    @Test
    
    public void verifySecondMostPopularCourse() {
    	
    	String secondMostPopularCourseTitle = driver.findElement(By.xpath("(//article)[3]//h3")).getText();
    	
    	Assert.assertEquals("Email Marketing Strategies", secondMostPopularCourseTitle);
    }
    

    @Test
    public void navigateToAnotherPage()  {
    	
    	driver.findElement(By.xpath("//a[text()='My Account']")).click();
    	
    	String titleOfPage = driver.getTitle();
    	
    	Assert.assertTrue(titleOfPage.contains("My Account"));
    }
    
    @Test
    public void verifyLoginIsSuccessful() {
    	
    	driver.findElement(By.xpath("//a[text()='My Account']")).click();
    	
    	String titleOfPage = driver.getTitle();
    	
    	Assert.assertTrue(titleOfPage.contains("My Account"));
    	
    	driver.findElement(By.xpath("//*[text()='Login']")).click();
    	
    	driver.findElement(By.id("user_login")).sendKeys("root");
    	
    	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	
    	Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")) != Null);
    	
    }
    
    @Test
    public void printTotalNumberOfCourses() {
    	
    	driver.findElement(By.xpath("//a[text()='All Courses']")).click();
    	
    	System.out.println("Total Number of Courses Available on Page = " + driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div")).size());
    	
    	
    }
    
    @Test
    
    public void contactAdmin() {
    	
    	driver.findElement(By.xpath("//*[text()='Contact']")).click();
    	
    	driver.findElement(By.xpath("//*[text()='Full Name ']//parent::div//input")).sendKeys("Testing1");
    	
    	driver.findElement(By.xpath("//*[text()='Email ']//parent::div//input")).sendKeys("Testing1@gmail.com");
    	
    	driver.findElement(By.xpath("//*[text()='Subject']//parent::div//input")).sendKeys("Testing1");
    	
    	driver.findElement(By.xpath("//*[text()='Comment or Message ']//parent::div//textarea")).sendKeys("Testing1");
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    	String confirmationText = driver.findElement(By.xpath("//*[text()='Thanks for contacting us! We will be in touch with you shortly.']")).getText();
    	
    	System.out.println("Text after Submission = " + confirmationText);
    }
    
    
    @Test
    public void courseCompletion() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//a[text()='My Account']")).click();
    	
    	driver.findElement(By.xpath("//*[text()='Login']")).click();
    	
    	driver.findElement(By.id("user_login")).sendKeys("root");
    	
    	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	
    	driver.findElement(By.xpath("//*[text()='All Courses']")).click();
    	
    	driver.findElement(By.xpath("//*[text()='Email Marketing Strategies']/following-sibling::p/a[text()='See more...']")).click();
    	
    	Thread.sleep(10000);
    	
    	driver.findElement(By.xpath("(//div[@class='ld-item-list-items ']/div)[1]")).click();
    	
    	int markCompleteButton = driver.findElements(By.xpath("(//input[@value='Mark Complete'])[1]")).size();
    	
    	if(markCompleteButton == 1 )
    	
    		driver.findElement(By.xpath("(//input[@value='Mark Complete'])[1]")).click();
    	
    }
    
    
    
    
    
    
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

	
}
