
package com.paymentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentservice.entity.PaymentTerm;

@Repository
public interface PaymentServiceDao extends JpaRepository<PaymentTerm, Integer> {

}
