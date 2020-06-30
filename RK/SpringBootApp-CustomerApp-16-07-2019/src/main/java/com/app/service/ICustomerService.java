package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {

	public Integer saveCustomer(Customer c);
	public List<Customer> getAllCustomers();
	public Customer getOneCustomer(Integer custId);
	public void deleteCustomer(Integer custId);
}


public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) throws RecordNotFoundException
    {
        Optional<Customer> employee = repository.findById(customer.getId());
         
        if(customer.isPresent())
        {
            Customar newEntity = customer.get();
            newEntity.set(customer.getEmail());
            newEntity.setFirstName(customer.getFirstName());
            newEntity.setLastName(customer.getLastName());
 
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }




