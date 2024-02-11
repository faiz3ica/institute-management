package com.ics.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ics.institute.model.student.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
