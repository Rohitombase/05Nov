package Utility;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseClass implements ITestListener {

public void onTestFailure(ITestResult result) {	
try {
	Screenshots.screens(driver, result.getName());
} catch (IOException e) {
	
	e.printStackTrace();
}	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
