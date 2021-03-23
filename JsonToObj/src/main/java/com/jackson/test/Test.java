package com.jackson.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.modal.Adress;
import com.jackson.modal.Employee;

public class Test {
	public static void main(String[] args) throws IOException {
		Adress adress = new Adress();

		adress.setHouseNo("wee");
		adress.setLocation("sangli");
		Employee employee = new Employee();
		employee.setEmpName("suresh");
		employee.setEmpId("bc");
		employee.setAdress(adress);

		ObjectMapper mappeer = new ObjectMapper();
		// objectToJson
		String json = mappeer.writeValueAsString(employee);
		System.out.println("JSON" + json.toString());
		mappeer.writeValue(new File("E:/logs/stds.json"), json);
		/*
		 * String json = "{\"empId\":\"bc\",\"empName\":\"suresh\"}"; String json2 =
		 * "{\"houseNo\":\"wee\",\"location\":\"sangli\"}}"; String json1 = "{}"; Adress
		 * adress = mappeer.readValue(json2, Adress.class); System.out.println(adress);
		 * Employee employee = mappeer.readValue(json1, Employee.class);
		 * System.out.println(employee.toString());
		 */

	}
}
