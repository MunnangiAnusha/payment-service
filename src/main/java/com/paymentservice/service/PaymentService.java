package com.paymentservice.service;

import java.util.List;

import com.paymentservice.entity.PaymentTerm;

public interface PaymentService {
	
	public PaymentTerm savePaymentService(PaymentTerm payment);
	
	public PaymentTerm getPaymentServiceById(Integer id);
	
	public List<PaymentTerm> getAllPaymentServices();
	
	boolean deletePaymentService(Integer id);

	public PaymentTerm updatePaymentService(PaymentTerm payment);

}
