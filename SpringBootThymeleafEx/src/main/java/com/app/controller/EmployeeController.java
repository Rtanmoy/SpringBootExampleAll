package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/reg")
	public String regPage(Model map) {
		//Form backing object
		Employee e=new Employee();
		map.addAttribute("employee",e);
		return "Register";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute Employee employee, Model map) {
		map.addAttribute("emp",employee);
		return "Info";
	}
	@RequestMapping("/all")
	public String showData(Model map) {
		map.addAttribute("message","hello UI");
		List<Employee>emps=Arrays.asList(
				new Employee(1,"AA",1.1),
				new Employee(2,"BB",2.2));
		map.addAttribute("list",emps);
		return "Data";
	}

}
