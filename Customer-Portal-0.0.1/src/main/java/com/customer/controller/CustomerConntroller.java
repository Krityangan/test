package com.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.urlconstant.URLConstants;

@RestController
public class CustomerConntroller {

	@RequestMapping(value=URLConstants.REST_GET_CUSTOMER_DETAILS, method = RequestMethod.GET)
	public String getCustomer()
	{
		return "This is the Customer Details";
	}
	
}
