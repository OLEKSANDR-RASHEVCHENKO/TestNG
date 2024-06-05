package TestNg.Annotation.C1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class C3 {
    @BeforeSuite
    void pqr(){
        System.out.println("Before siut");
    }
    @AfterSuite
    void as(){
        System.out.println("After suit ");
    }
}
