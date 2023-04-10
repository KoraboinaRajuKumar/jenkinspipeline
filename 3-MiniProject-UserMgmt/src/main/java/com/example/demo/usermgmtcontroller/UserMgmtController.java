package com.example.demo.usermgmtcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginForm;
import com.example.demo.usermgmtentity.UserMaster;
import com.example.demo.usermgmtservice.UserMgmtServiceImpl;

@RestController
public class UserMgmtController {

	@Autowired
	private UserMgmtServiceImpl service;

	@PostMapping("saveuser")
	public ResponseEntity<String> saveUser(@RequestBody UserMaster master) {

		String data = service.saveUserData(master);

		return new ResponseEntity<String>(data, HttpStatus.OK);
	}

	@GetMapping("email/{email}")
	public ResponseEntity<String> emailCheck(@PathVariable String email) {

		String mail = service.emailChecks(email);

		return new ResponseEntity<String>(mail, HttpStatus.OK);

	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginForm form) {
		String login = service.findByEmailAndPwd(form);
		return new ResponseEntity<String>(login, HttpStatus.OK);
	}

}
