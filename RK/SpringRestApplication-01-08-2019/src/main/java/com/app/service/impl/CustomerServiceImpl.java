package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Customer;
import com.app.repo.CustomerRepository;
import com.app.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private CustomerRepository repo;
  @Transactional
  public Integer saveCustomer(Customer c) {
	c=repo.save(c);
	return c.getCid();
}
@Transactional(readOnly = true)
public List<Customer> getAllCustomers() {
	List<Customer> custlist=repo.findAll();
	if(custlist!=null && !custlist.isEmpty()) {
		custlist.stream()
		.sorted((s1,s2)->s1.getCname()
				.compareTo(s2.getCname()));
	}
	return custlist;
}
@Transactional(readOnly = true)
public Customer getOneCustomer(Integer id) {
	Optional<Customer> op=repo.findById(id);
	if(op.isPresent()) {
		return op.get();
	}
	return null;
}
@Transactional
public void deleteCustomer(Integer id) {
	repo.deleteById(id);
	
}
}
