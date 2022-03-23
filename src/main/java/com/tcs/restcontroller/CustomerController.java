/**
 * 
 */
package com.tcs.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.model.Customer;


/**
 * @author springuser01
 *
 */
@RestController
public class CustomerController {
	
	//This method is returning simple helloWorld after hitting the URL /helloWorld
	@RequestMapping( method = RequestMethod.GET, value = "/helloWorld")
	public String helloWorld() {
		
		
		return "Hello World";
	}
	

	//This method is return the details of the customer after hitting the URL /details	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/details")
		@ResponseBody
	 public Customer details(){
		//Hard coded  value inside the customer object
		Customer c1=new Customer();
		c1.setCustomerId(101);
		c1.setCustomerName("XYZ");
		c1.setCustomerAddress("abc");
			
		
		return c1;
		   
	}

}
