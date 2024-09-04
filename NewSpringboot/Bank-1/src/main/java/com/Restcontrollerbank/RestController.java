package com.Restcontrollerbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

public class RestController {
	

	@RequestMapping("/api/bank")
	@Slf4j
	public class BankRestController {
		
		@Autowired
		BankProcess bankProcess;
		
		
		@GetMapping(value ="/test")
		public String getValues() {
			String response = null;
			//log.info("start");
			response = bankProcess.getDetails();
			return response;
		}
		

		@GetMapping(value="/yamuna")
		public String getDetails() {
			//String response = bankProcess.getDetails();
			
			return bankProcess.getDetails();
			
		}

}
