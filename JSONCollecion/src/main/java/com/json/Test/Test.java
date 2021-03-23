package com.json.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.modal.Adress;
import com.json.modal.Employee;

public class Test {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("P1");
		al.add("P2");
		al.add("P3");

		Set<String> set = new HashSet<String>();
		set.add("M1");
		set.add("M2");
		set.add("M3");

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("V1", 12);
		map.put("V2", 16);
		map.put("V3", 18);

		Adress addr = new Adress();
		addr.setHno("5-99/A");
		addr.setLoc("HYD-IND");

		// 1. Create model class object
		Employee emp = new Employee();
		emp.setEid(100);
		emp.setEname("A");
		emp.setEsal(200.0);
		emp.setEprjs(al);
		emp.setModules(set);
		emp.setPrjvr(map);
		emp.setAdress(addr);

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(emp);
		System.out.println(json);
	}

}
