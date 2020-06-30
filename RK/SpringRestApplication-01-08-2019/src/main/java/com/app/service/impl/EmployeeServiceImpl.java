package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.model.Employee;
import com.app.repo.EmployeeRepository;
import com.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;
	@Transactional
	public Integer saveEmployee(Employee e) {
		e=repo.save(e);
		return e.getEid();
	}

	@Transactional(readOnly = true)
	public List<Employee> getAllEmployee() {
		List<Employee> emplist=repo.findAll();
		if(emplist!=null && !emplist.isEmpty()) {
			emplist.stream()
			.sorted((s1,s2)->s1.getEname()
					.compareTo(s2.getEname()));
		}
		return emplist;
	}

	@Transactional(readOnly = true)
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> op=repo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Transactional
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}
	
}
