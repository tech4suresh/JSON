package com.json.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.model.User;

public class Test {
	public static void main(String[] args) {
		User usr = new User();
		// usr.setUid(10);
		usr.setUname("SAMPLE");
		usr.setPwd("ABC123");
		usr.setUrole("ADMIN");

		ObjectMapper om = new ObjectMapper();
		String json = null;
		try {
			json = om.writeValueAsString(usr);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
