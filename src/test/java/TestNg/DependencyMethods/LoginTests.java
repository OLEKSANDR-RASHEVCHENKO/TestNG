package TestNg.DependencyMethods;

import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1,groups = {"sanity"})
    void loginByEmail(){
        System.out.println("tihs is login by email");
    }
    @Test(priority = 2,groups = {"sanity"})
    void loginByFacebook(){
        System.out.println("tihs is login by facebook");
    }
    @Test(priority = 3,groups = {"sanity"})
    void loginByTwitter(){
        System.out.println("tihs is login by Twitter");
    }
}
