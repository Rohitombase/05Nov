package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Login;
import Utility.BaseClass;

@Listeners(Utility.Listener.class)
public class SampleTest extends BaseClass {

@BeforeMethod

public void LaunchBrowser() {
	driver = Browser.openbrowser();
}

@Test
public void test1() {
	System.out.println("test1 is Execuated");
}
@Test

public void test10()
{
	Login xyz = new Login(driver);
	xyz.LogIn();	
	System.out.println("test10 is execuated");
}

@Test(timeOut = 4000)
public void test15() throws InterruptedException {
Thread.sleep(5000);
Login xyz = new Login(driver);
xyz.LogIn();	

System.out.println("test11 is execuated");
}



}
