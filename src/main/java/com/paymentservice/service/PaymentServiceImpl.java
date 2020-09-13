package com.paymentservice.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentservice.dao.PaymentServiceDao;
import com.paymentservice.entity.PaymentTerm;

@Service
public class PaymentServiceImpl implements PaymentService {

	private static final Logger  LOGGER = LoggerFactory.getLogger(PaymentServiceImpl.class.getPackage().getName());
	  @Autowired
	  private PaymentServiceDao paymentServiceDao;
	 
		/*
		 * @Autowired private PaymentTermCache paymentTermCache;
		 */

	@Override
	public PaymentTerm savePaymentService(PaymentTerm payment) {
		LOGGER.trace("in service savePaymentService ");
		PaymentTerm pay = null;
		try {
			payment.setCreationDate(new Date());
			 pay = paymentServiceDao.save(payment);
			//pay = paymentTermCache.savePaymentService(payment);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return pay;

	}

	@Override
	public PaymentTerm updatePaymentService(PaymentTerm payment) {
		LOGGER.trace("in service updatePaymentService ");
		PaymentTerm save = null;
		try {
			PaymentTerm paymentServiceById = getPaymentServiceById(payment.getId());
			PaymentTerm pay = new PaymentTerm();
			if (paymentServiceById != null) {
				pay.setId(payment.getId());
				pay.setDiscription(payment.getDiscription());
				pay.setCode(payment.getCode());
				pay.setCreationDate(payment.getCreationDate());
				pay.setDays(payment.getDays());
				pay.setRemindBeforeDays(payment.getRemindBeforeDays());
				save = paymentServiceDao.save(pay);
				//save = paymentTermCache.updatePaymentService(pay);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return save;
	}

	@Override
	public PaymentTerm getPaymentServiceById(Integer id) {
		LOGGER.trace("in service getPaymentServiceById ");
		PaymentTerm payment = null;
		try {
			Optional<PaymentTerm> pay = paymentServiceDao.findById(id);
			//payment = paymentTermCache.getPaymentServiceById(id);
			//if (pay != null) {
				//payment = pay.get();
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return payment;
	}

	@Override
	public List<PaymentTerm> getAllPaymentServices() {
		LOGGER.trace("in service getAllPaymentServices ");
		List<PaymentTerm> list = null;
		try {
		list = paymentServiceDao.findAll();
		//	list =	paymentTermCache.getAllPaymentServices();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deletePaymentService(Integer id) {
		LOGGER.trace("in service deletePaymentService ");
		boolean b = false;
		try {
			paymentServiceDao.deleteById(id);
//			paymentTermCache.deletePaymentService(id);
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

}
