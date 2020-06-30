package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		List<Product> prod=Arrays.asList(
				 new Product(3,"AA","I","0I0",3.3),
				 new Product(4,"RR","W","4K4",4.4),
				 new Product(5,"OO","Q","1E1",5.5),
				 new Product(6,"NN","X","1O1",6.6),
				 new Product(7,"MM","Y","1A1",7.7),
				 new Product(8,"AA","T","2B2",8.8),
				 new Product(9,"FF","Z","3C3",9.9));
       repo.saveAll(prod);          
		//Page <Product> list= repo.findAll();
		Page<Product> list=repo.findByProdCode(1E1,PageRequest.of(1,3));
		list.stream()
		    .filter(p->p.getProdId()!=null)
		    .sorted((p1,p2)->p2.getProdId()-p1.getProdId())
		    .map(p->p.getProdCost()+"  "+p.getProdId()+"   "+p.getProdModel())
		    .forEach(System.out::println);    
      
		/*      Page<Product> page=repo.findByProdCode(1E1,PageRequest.of(1,3));
      System.out.println(page.isEmpty());
       System.out.println(page.isFirst());
       System.out.println(page.isLast());
       System.out.println(page.hasNext());
       System.out.println(page.hasPrevious());
       System.out.println(page.getSize());
       System.out.println(page.getTotalElements());
       System.out.println(page.getTotalPages());
       System.out.println(page.hasContent());
       System.out.println(page.getNumber());      */
       
    /*  page
        .stream()
	    .filter(p->p.getProdCode()!=null)
	    .sorted((p1,p2)->p2.getProdId()-p1.getProdId())
	    .map(p->p.getProdCost()+"  "+p.getProdId()+"   "+p.getProdModel())
	    .forEach(System.out::println);    */
	}

}
