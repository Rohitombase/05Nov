package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

public static void screens(WebDriver driver, String name) throws IOException {
		
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File destination = new File ("C:\\Users\\Rohit Ombase\\Desktop\\Workspace\\Rohit\\Screenshots\\" +name+".png");
FileHandler.copy(source, destination);
}
}