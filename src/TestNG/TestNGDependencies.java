package TestNG;

import org.testng.annotations.Test;
@Test(groups = {"DependencyTestGroup"})
public class TestNGDependencies {
	@Test(dependsOnMethods = "verifyUserLogin")
	public void login() {
		System.out.println("Loged in Sucessfuly.......");
	}

	public void verifyUserLogin() {
		System.out.println("Yes this user is Valied.");
	}
	
	@Test(dependsOnMethods = "verifyUserLogin")
	public void verifyreportSettings() {
		System.out.println("User Is Now at Report Settings Page.");
	}

	
	@Test(dependsOnMethods = "verifyreportSettings")
	public void verifyGeneralSettings() {
		System.out.println("User Is Now at General Settings Page.");
	}
	
	@Test(groups = {"accountGroup"})
	public void verifyAccountSettings() {
		System.out.println("This is account page.");
	}
	@Test(groups = {"userGroup"})
	public void verifyWishlistPage() {
		System.out.println("This is wishlist page..");
	}

}
