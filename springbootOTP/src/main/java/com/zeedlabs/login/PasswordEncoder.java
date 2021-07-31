package com.zeedlabs.login;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String rawPassword = "Pass123$$";

		String encodedPassword = encoder.encode(rawPassword);

		
		System.out.println(encodedPassword);

		
	}
}
