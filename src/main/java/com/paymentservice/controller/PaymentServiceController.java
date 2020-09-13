package com.paymentservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentservice.entity.PaymentTerm;
import com.paymentservice.service.PaymentService;

@RestController
@CrossOrigin(origins ="*" , maxAge = 3600)
public class PaymentServiceController {
	
	private static final Logger  LOGGER = LoggerFactory.getLogger(PaymentServiceController.class.getPackage().getName());
	
	@Autowired
	private PaymentService paymentService;

	@PostMapping(value="/payment-term")
	public ResponseEntity<Object> savePaymentService(@RequestBody PaymentTerm payment) {
		LOGGER.trace("in savePaymentService");
		PaymentTerm pay = paymentService.savePaymentService(payment);
		if(pay ==null) {
			return new ResponseEntity<>("Failed to save payment service" , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(pay , HttpStatus.CREATED);
		
	}
	
	@PutMapping(value="/payment-term")
	public ResponseEntity<Object> updatePaymentService(@RequestBody PaymentTerm payment) {
		LOGGER.trace("in updatePaymentService");
		PaymentTerm pay = paymentService.updatePaymentService(payment);
		if(pay ==null) {
			return new ResponseEntity<>("Failed to update payment service" , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(pay , HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/payment-term/{id}")
	public ResponseEntity<Object> getPaymentServiceById(@PathVariable Integer id) {
		LOGGER.trace("in getPaymentServiceById");
		PaymentTerm pay = paymentService.getPaymentServiceById(id);
		if(pay ==null) {
			return new ResponseEntity<>("No records found" , HttpStatus.OK);
		}
		return new ResponseEntity<>(pay , HttpStatus.OK);
		
	}
	
	@GetMapping(value="/payment-terms")
	public ResponseEntity<Object> getAllPaymentServices() {
		LOGGER.trace("in getAllPaymentServices" );
		List<PaymentTerm> list = paymentService.getAllPaymentServices();
		if(list == null ||list.size() == 0 ) {
			return new ResponseEntity<>("No records found" , HttpStatus.OK);
		}
		return new ResponseEntity<>(list , HttpStatus.CREATED);
		
	}
	
	@DeleteMapping(value="/payment-term/{id}")
	public ResponseEntity<Object> deletePaymentService(@PathVariable Integer id) {
		LOGGER.trace("i deletePaymentService");
	 boolean deletePaymentService = paymentService.deletePaymentService(id);
		if(!deletePaymentService ) {
			return new ResponseEntity<>("Failed to delete payment service" , HttpStatus.OK);
		}
		return new ResponseEntity<>("PaymentTerm service deleted successfully" , HttpStatus.OK);
		
	}
	
	
}
