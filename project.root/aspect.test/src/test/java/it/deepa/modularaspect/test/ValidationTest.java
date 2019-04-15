package it.deepa.modularaspect.test;

import it.deepa.modularaspect.aspect.api.InternalStateValidationException;
import it.deepa.modularaspect.test.bean.TestValidationBean;
import org.junit.Test;

public class ValidationTest {

    @Test
    public void testValidation(){
        TestValidationBean validation = new TestValidationBean("ciao");
    }

    @Test(expected = InternalStateValidationException.class)
    public void testError(){
        TestValidationBean validation = new TestValidationBean("error");
    }



}
