package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.datamodel.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.urlconstant.URLConstants;

@RestController
public class CustomerConntroller {

	@Autowired
	private CustomerRepository  customerRepo;
	
	@RequestMapping(value=URLConstants.REST_GET_CUSTOMER_DETAILS, method = RequestMethod.GET)
	public List<Customer> getCustomer()
	{
	
		return (List<Customer>) customerRepo.findAll();
		
	}
	
	@RequestMapping(value=URLConstants.REST_SAVE_CUSTOMER_RECORDS, method = RequestMethod.POST)
	public String saveCustomerRecord(@RequestBody Customer customer)
	{
		customerRepo.save(customer);
		return "Records saved successfully";
	}
	
//	@RequestMapping(value=URLConstants.REST_UPDATE_CUSTOMER_RECORDS, method = RequestMethod.POST)
//	public String saveCustomerRecord(@RequestParam Long id,@RequestBody Customer customer)
//	{
//		Optional<Customer> cust= customerRepo.findById(id);
//		
//		return "Records saved successfully";
//	}
}
