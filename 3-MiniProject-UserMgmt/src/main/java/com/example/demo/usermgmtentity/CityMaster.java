package com.example.demo.usermgmtentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "city_master")
public class CityMaster {

	@Id
	private Integer cityId;

	private String cityname;

	private Integer stateId;

}
