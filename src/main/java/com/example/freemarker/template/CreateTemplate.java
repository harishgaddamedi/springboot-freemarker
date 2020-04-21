package com.example.freemarker.template;

import java.io.StringWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.example.freemarker.model.Employee;

import freemarker.template.Template;

@Service
public class CreateTemplate {

	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;

	public String template(Employee employee) throws Exception {
		Template template = freeMarkerConfigurer.createConfiguration().getTemplate("employee.flth");
		StringWriter writer = new StringWriter();
		template.process(employee, writer);
		System.out.println("Request: " + writer.toString());
		return writer.toString();
	}

}
