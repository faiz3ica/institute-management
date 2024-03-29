package com.ics.institute.service;

import org.springframework.stereotype.Service;

import com.ics.institute.model.student.Address;

@Service
public interface AddressService {
	public Address saveAddress(Address address);
	public Address getAddress(Integer addressId);
}
