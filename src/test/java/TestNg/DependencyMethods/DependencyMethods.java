package TestNg.DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
    @Test(priority = 1)
    void openApp(){
        Assert.assertTrue(true);
    }
    @Test(priority = 2,dependsOnMethods = {"openApp"})//if method openApp past then will be exicute
    void login(){
        Assert.assertTrue(true);
    }
    @Test(priority = 3,dependsOnMethods = {"login"})
    void search(){
        Assert.assertTrue(false);

    }
    @Test(priority = 4,dependsOnMethods = {"login","search"})
    void asserch(){
        Assert.assertTrue(true);
    }
    @Test(priority = 5,dependsOnMethods = {"openApp"})
    void logout(){
        Assert.assertTrue(true);
    }
}
