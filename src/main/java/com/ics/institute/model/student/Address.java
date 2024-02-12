package com.ics.institute.model.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="building_name")
	private String buildingName;
	@Column(name="building_no")
	private int buildingNo;
	@Column(name="street_name")
	private String streeName;
	@Column(name="city")
	private String city;
	@Column(name="pinCode")
	private String pinCode;
	@Column(name="country")
	private String country;
	
	@ManyToOne
	@JoinColumn(name="roll_no")
	Student student;
}
