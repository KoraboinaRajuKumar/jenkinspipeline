package com.example.demo.usermgmtservice;

import com.example.demo.model.LoginForm;
import com.example.demo.usermgmtentity.UserMaster;

public interface IUserMgmtService {

	public String saveUserData(UserMaster master);

	public String emailChecks(String email);
	
	public String findByEmailAndPwd(LoginForm form);

}
