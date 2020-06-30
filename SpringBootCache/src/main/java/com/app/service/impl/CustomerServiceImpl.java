package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService {
@Autowired
private CustomerRepository repo;

@Transactional
public Integer saveCustomer(Customer c) {	
	
	return repo.save(c).getCustId();
}

@Transactional(readOnly=true)
public List<Customer> getAllCustomer() {

	return repo.findAll();
}

@Transactional(readOnly=true)
@Cacheable(value="cust-cache",key="#custId")
public Customer getOneCustomer(Integer custId) {
	Optional<Customer> c=repo.findById(custId);
	if(c.isPresent()) {
		return c.get();
	}
	return null;
}

@Transactional
@CacheEvict(value="cust-cache",key="#custId")
public void deleteCustomer(Integer custId) {
repo.deleteById(custId);	
}
/*
@Transactional
	public Customer updateCustomer(Customer c) {
	 Optional<Customer> customer = repo.findById(c.getCustId());
     
     if(customer.isPresent())
     {
         Customer newEntity = customer.get();
         newEntity.setCustCode(c.getCustCode());
         newEntity.setCustName(c.getCustName());
         newEntity.setCustType(c.getCustType());
         newEntity.setNote(c.getNote());

         newEntity=repo.save(newEntity);
          
         return newEntity;
     } else {
         c = repo.save(c);
          
         return c;
     }
	}  */

@Override
@Transactional
@CachePut(value="customer-cache",key="#custId")
public Customer updateCustomer(Customer c,Integer custId) {
	return repo.save(c);
}

}
