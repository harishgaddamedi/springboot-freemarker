package com.example.freemarker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.freemarker.model.Employee;
import com.example.freemarker.template.CreateTemplate;

@RestController
public class FreeMarkerController {

	@Autowired
	private CreateTemplate createTemplate;

	@RequestMapping("/getTemplate")
	public String getTemplate(@RequestParam("empName") String name, @RequestParam("empId") int id) throws Exception {
		Employee employee = new Employee(name, id);
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("FreeMarker");
		skills.add("RabbitMq");
		List<String> skills1 = new ArrayList<>();
		skills1.add("AI");
		skills1.add("Machine Learning");
		skills1.add("Deep Learning");
		Map<String, List<String>> map = new HashMap<>();
		map.put("JAVA1001", skills);
		map.put("AI1002", skills1);
		employee.setSkills(map);
		return createTemplate.template(employee);
	}

}
