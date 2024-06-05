package TestNg.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
    @Test
    void testTitle()
    {
        String exp_title="Opencart";
        String act_title="Opencart";

//        if (exp_title.equals(act_title)){
//            System.out.println("test past");
//        }else {
//            System.out.println("test failed");
//        }
        if (exp_title.equals(act_title)){
            System.out.println("Test past");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test failed");
            Assert.assertTrue(false);
        }
}
}
