package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController
@RequestMapping("/home")
public class HomeRestController {
 @GetMapping("/show")
 public String show() {
	 return "From Get";
 }
 
 @GetMapping("/showa")
 public ResponseEntity<String> showA(){
	 return  new ResponseEntity<String>("From Get",HttpStatus.NO_CONTENT);
 }
 @PostMapping("/save")
 public Employee save() {
	 return new Employee(10,"AA");
 }
 @PostMapping("/all")
 public List<Employee> all(){
	 return Arrays.asList(
			 
			 new Employee(10,"AA") ,
			 new Employee(11,"AB"),
			 new Employee(12,"AV"));
 }
 
 @PostMapping("/head")
 public String showHeader(@RequestHeader("sample")String s) {
	 return "Hello:"+s;
 }
 @PostMapping("/body")
 public String showBody(@RequestBody Employee employee) {
	 return "Hello Body:"+employee;
 }
 
 
 
 @PutMapping("/update")
 public String modify() {
	 return "From Update";
 }
 
 @DeleteMapping("/remove")
 public String del() {
	 return "From Delete";
 }
 @PatchMapping("/updatep")
 public String partial() {
	 return "From Modify Few:";
 }


}
