package iron;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest2 {
  @Test(dataProvider = "dp")
  public void login(String name, String password) {
	  System.out.println("name\t"+name);
	  System.out.println("password\t"+password);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "asd", "a" },
      new Object[] { "fgh", "b" },
    };
  }
}
