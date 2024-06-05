package TestNg;

/*
 1) Open app
 2) Login
 3) Logout

 */

import org.testng.annotations.Test;

//        -4 -5 -3 -2 -1  0 1 2 3 4 5
public class FirstTestCasePriority {

    @Test(priority = 1)
    void logout() {
        System.out.println("Logout from application.....");
    }


    @Test(priority = 3)
    void login() {
        System.out.println("Login to application.....");
    }

    @Test(priority = 2)
    void openapp() {
        System.out.println("opening application...");
    }
}