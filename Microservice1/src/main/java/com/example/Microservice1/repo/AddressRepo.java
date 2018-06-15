package com.example.Microservice1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Microservice1.modal.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

}
