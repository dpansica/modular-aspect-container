package it.solutionsexmachina.modularaspect.test;

import it.solutionsexmachina.modularaspect.aspect.api.InternalStateValidationException;
import it.solutionsexmachina.modularaspect.test.bean.TestValidationBean;
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
