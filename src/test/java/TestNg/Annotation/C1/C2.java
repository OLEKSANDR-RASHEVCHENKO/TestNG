package TestNg.Annotation.C1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
    @Test
    void xyz(){
        System.out.println("this is xyz from c2");
    }
    @AfterTest
    void at(){
        System.out.println("This is AfterTest methode");
    }
}
