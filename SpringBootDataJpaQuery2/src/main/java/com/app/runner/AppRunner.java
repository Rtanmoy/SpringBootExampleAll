package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
 @Component
public class AppRunner implements CommandLineRunner{
    @Autowired
    private ProductRepository repo;
    
	@Override
	public void run(String... args) throws Exception {
		
		List<Product> prod=Arrays.asList(
				new Product(13,"M",7.7),
                new Product(14,"A",8.8),
                new Product(15,"N",9.9),
                new Product(16,"X",10.9));

repo.saveAll(prod);
}
 }