package com.ics.institute.model.student;

import lombok.Data;

@Data
public class Address {
	private String buildingName;
	private int buildingNo;
	private String streeName;
	private String city;
	private String pinCode;
	private String country;
}
