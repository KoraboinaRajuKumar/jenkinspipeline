package com.example.demo.usermgmtentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="state_master")
public class StateMaster {
	
	@Id
	private Integer stateId;
	
	private String stateName;
	
	private Integer countryId;
	

}
