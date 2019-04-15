package it.solutionsexmachina.modularaspect.test.bean;

import it.solutionsexmachina.modularaspect.aspect.api.InternalStateValidationException;
import it.solutionsexmachina.modularaspect.aspect.api.Validatable;
import it.solutionsexmachina.modularaspect.aspect.impl.ValidationAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestValidationBean implements Validatable {

    private static final Logger log = LoggerFactory.getLogger(ValidationAspect.class);

    private String message;

    @Override
    public void validateInternalState() throws InternalStateValidationException {
        log.info("Validation input: "+this.message);
        if (this.message.equals("error")) {
            log.info("Throw Exception");
            throw new InternalStateValidationException("something went wrong");
        }
    }

    public TestValidationBean(String message){
        this.message = message;
    }

}
