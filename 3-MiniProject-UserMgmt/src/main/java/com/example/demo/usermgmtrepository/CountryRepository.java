package com.example.demo.usermgmtrepository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.usermgmtentity.CountryMaster;


public interface CountryRepository extends JpaRepository<CountryMaster, Serializable>{
	

}
