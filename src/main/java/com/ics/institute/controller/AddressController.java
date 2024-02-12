package com.ics.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ics.institute.model.student.Address;
import com.ics.institute.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping(value="/view")
	public String getStudent(@RequestParam("rollNo") Integer rollNo) {
		return "Return Address";
	}
	
	@PostMapping(value="/save")
	public String saveStudent(@RequestBody Address address) {
		Address result=addressService.saveAddress(address);
		return "Saved:"+result;
	}
}
