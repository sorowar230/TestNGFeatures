package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataprovider {
	@Test(dataProvider = "getData1")
	public void loginInfo( String Uid, String Pwd) {
		System.out.println("UserName is: " + Uid);
		System.out.println("Password is: " + Pwd);
	}
	@DataProvider(name="getData1")
	public  String[][] getData() {
		String[][] values = new String[2][2];
        values[0][0] = "First Uid";
        values[0][1] = "First Pwd";
        values[1][0] = "Second Uid";
        values[1][1] = "Second Pwd";
		return values;
	}
}
