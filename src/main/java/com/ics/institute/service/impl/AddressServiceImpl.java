package com.ics.institute.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ics.institute.model.student.Address;
import com.ics.institute.repository.AddressRepo;
import com.ics.institute.service.AddressService;

@Component
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepo addressRepo;

	@Override
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}

	@Override
	public Address getAddress(Integer addressId) {
		// TODO Auto-generated method stub
		return null;
	}

}
