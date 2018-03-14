package com.akalanka.coursemanagement.validator;

import com.akalanka.coursemanagement.backend.dto.TimeTable;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ExtraLectureValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return TimeTable.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        TimeTable timeTable  = (TimeTable) target;


    }

}
