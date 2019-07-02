package iron;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest1 {
	String ExpectedResult="loginpage";
	@BeforeTest
	public void beforetest()
	{
		System.out.println("open browser");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("open URL");
	}
	  @AfterTest
	  public void aftertest()
	  {
		  System.out.println("CLOSE THE BROWSER");
	  }
  @Test
  public void login() {
	 Assert.assertEquals("loginpage",ExpectedResult);
	 System.out.println("login");
  }
  @Test(priority=1)
  public void search()
  {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("search");
	  sa.assertEquals(10,10);
	  sa.assertEquals(20,20);
	  sa.assertAll();
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("before every testcase");
  }
  
@AfterMethod
public void aftermethod()
{
	System.out.println("after every testcase");
}
  @AfterClass
  public void afterclass()
  {
	  System.out.println("logout");
  }
}
