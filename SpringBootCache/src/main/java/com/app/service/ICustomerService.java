package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
public Integer saveCustomer(Customer c);
public List<Customer> getAllCustomer();
public Customer getOneCustomer(Integer custId);
public void deleteCustomer(Integer custId);
public Customer updateCustomer(Customer c,Integer custId);
}