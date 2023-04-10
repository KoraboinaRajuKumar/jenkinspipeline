package com.example.demo.usermgmtrepository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.usermgmtentity.UserMaster;

@Repository
public interface UserRepository extends JpaRepository<UserMaster, Serializable> {

	public UserMaster findByEmail(String email);

	public UserMaster findByEmailAndPwd(String email, String pwd);

}
