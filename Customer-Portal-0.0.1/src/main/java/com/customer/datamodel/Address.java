package com.customer.datamodel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@Entity
@Table(name="customer_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty("type")
	private String addressType;
	@JsonProperty("line1")
	private String addressLine1;
	@JsonProperty("line2")
	private String addressLine2;
	@JsonProperty("state")
	private String state;
	@JsonProperty("landmark")
	private String landmark;
	@JsonProperty("pincode")
	private String pincode;
	@JsonProperty("country")
	private String country;
}
