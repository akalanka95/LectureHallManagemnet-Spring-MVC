package com.akalanka.coursemanagement.validator;

import com.akalanka.coursemanagement.backend.dto.Lecture;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



public class LectureValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Lecture.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		
		Lecture product  = (Lecture) target;
		
		//Checking whether a file has been selected 
		if(product.getFile() == null || 
				product.getFile().getOriginalFilename().equals("")) {
			
			errors.rejectValue("file", null,"Please select an image file to upload!");
			return;
		}
			
		if(!(product.getFile().getContentType().equals("image/jpg") || 
				product.getFile().getContentType().equals("image/png") ||
				product.getFile().getContentType().equals("image/gif") ||
				product.getFile().getContentType().equals("image/jpeg")
					) ) {
			
			errors.rejectValue("file", null, "please choose only image files for upload!");
			return;
		}
	}

}
