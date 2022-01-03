package FST_AppiumProject;

import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TestEmulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", "com.google.android.apps.tasks.ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }
    
    @Test
    public void addNewTask() {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	//Adding FirstTask
    	
    	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task")));
        
        driver.findElementByAccessibilityId("Create new task").click();
        
        MobileElement addTaskContent = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        
        addTaskContent.sendKeys("Complete Activity with Google Tasks");
        
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        
        //Adding Second Task
        
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task")));
       
        driver.findElementByAccessibilityId("Create new task").click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        
        addTaskContent = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        
        addTaskContent.sendKeys("Complete Activity with Google Keep");
        
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        
        //Adding Third Task
        
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task")));
        
        driver.findElementByAccessibilityId("Create new task").click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        
        addTaskContent = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
        
        addTaskContent.sendKeys("Complete the second Activity Google Keep");
        
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        
    	List<MobileElement> taskTitles= driver.findElementsById("task_name");
        
        Assert.assertEquals(taskTitles.get(0).getText(), "Complete the second Activity Google Keep");
        Assert.assertEquals(taskTitles.get(1).getText(), "Complete Activity with Google Keep");
        Assert.assertEquals(taskTitles.get(2).getText(), "Complete Activity with Google Tasks");
        
    }
    
    @Test
    public void testSearchAppium() {
        String title = "Test Appium";
        String  note = "Test";
        
        //Add a note
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.ImageButton")));
        driver.findElementById("new_note_button").click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText")));
        driver.findElementById("editable_title").click();
        driver.findElementById("editable_title").sendKeys(title);
        driver.findElementById("edit_note_text").click();
        driver.findElementById("edit_note_text").sendKeys(note);
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
        
        //Check if the note is successfully saved
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("index_note_title")));
        List<MobileElement> titles = driver.findElementsById("index_note_title");
        List<MobileElement> notes = driver.findElementsById("index_note_text_description");
        Assert.assertEquals(titles.get(0).getText(), title);
        Assert.assertEquals(notes.get(0).getText(), note);
    }

    
    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
