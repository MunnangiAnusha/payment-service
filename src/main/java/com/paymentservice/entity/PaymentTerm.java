package com.paymentservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class PaymentTerm {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String code ;
	
	@Column
	private String discription;
	
	@Column
	private  Date creationDate;
	
	@Column
	private Integer days;
	
	@Column
	private Integer remindBeforeDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getRemindBeforeDays() {
		return remindBeforeDays;
	}

	public void setRemindBeforeDays(Integer remindBeforeDays) {
		this.remindBeforeDays = remindBeforeDays;
	}

	@Override
	public String toString() {
		return "PaymentTerm [id=" + id + ", code=" + code + ", discription=" + discription + ", creationDate="
				+ creationDate + ", days=" + days + ", remindBeforeDays=" + remindBeforeDays + "]";
	}
	
	
	
}
