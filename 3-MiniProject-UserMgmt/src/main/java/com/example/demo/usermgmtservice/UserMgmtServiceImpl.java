package com.example.demo.usermgmtservice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoginForm;
import com.example.demo.usermgmtentity.UserMaster;
import com.example.demo.usermgmtrepository.UserRepository;

@Service
public class UserMgmtServiceImpl implements IUserMgmtService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public String saveUserData(UserMaster master) {

		master.setAccountStatus("LOCKED");

		master.setPwd(generaterandomPwd());

		UserMaster save = userRepo.save(master);

		if (save.getUserid() != null) {

			return "User Data saved";
		}
		return "User data not saved";

	}

	@Override
	public String emailChecks(String email) {

		UserMaster user = userRepo.findByEmail(email);

		if (user == null) {
			return "UNIQUE EMAIL ID";
		}
		return "DUPLICATE EMAIL";

	}

	// Generate random pwd

	private String generaterandomPwd() {

		String text = "abcdefghijklmnopqrstuvwxyz1234567890";

		StringBuilder sb = new StringBuilder();

		Random random = new Random();

		int pwdLength = 6;

		for (int i = 1; i <= pwdLength; i++) {
			int index = random.nextInt(text.length());
			sb.append(text.charAt(index));
		}
		return sb.toString();

	}

	@Override
	public String findByEmailAndPwd(LoginForm form) {

		UserMaster userdata = userRepo.findByEmailAndPwd(form.getEmail(), form.getPwd());

		if (userdata == null) {
			return "invalid credentials";
		}

		if (userdata.getAccountStatus().equals("LOCKED")) {
			return "Account Locked";
		}

		return "SUCCESS";

	}

}
