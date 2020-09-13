package com.paymentservice.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.paymentservice.entity.PaymentTerm;

@Component
public class PaymentTermCache {
	 static Integer id = 1;
	public static Map<Integer , PaymentTerm> paymentMap = new HashMap<>();
	
	
public PaymentTerm savePaymentService(PaymentTerm payment) {
	payment.setId(id);
	
	paymentMap.put(id , payment );
	System.out.println(paymentMap);
	id = id+1 ;
	return payment;
	
}
	
	public PaymentTerm getPaymentServiceById(Integer id) {

		return paymentMap.get(id);
		
	}
	
	public List<PaymentTerm> getAllPaymentServices(){
		
		return new ArrayList<>(paymentMap.values());
		
	}
	
	public boolean deletePaymentService(Integer id) {
		paymentMap.remove(id);
		return true;
		
	}

	public PaymentTerm updatePaymentService(PaymentTerm payment) {
		System.out.println("update in cache");
		paymentMap.put(payment.getId() , payment );
		return payment;
		
	}


}
