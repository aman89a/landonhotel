package com.company.landonhotel;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.company.landonhotel.controller.QuoteRequestController;
import com.company.landonhotel.controller.QuoteRequestManagementController;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(assignableTypes = {
		QuoteRequestController.class,
		QuoteRequestManagementController.class
})
public class QuoteRequestManagementAdvice {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		
		binder.registerCustomEditor(Date.class, 
				new CustomDateEditor(dateFormat, false));;
		
	}
}
