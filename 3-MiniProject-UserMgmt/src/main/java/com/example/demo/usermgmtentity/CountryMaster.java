package com.example.demo.usermgmtentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_master")
public class CountryMaster {

	@Id
	private Integer countryId;

	private String countryName;

}
