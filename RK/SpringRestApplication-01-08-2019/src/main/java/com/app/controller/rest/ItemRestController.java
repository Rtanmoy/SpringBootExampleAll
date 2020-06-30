package com.app.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.Item;
import com.app.service.IItemService;

@RestController
@RequestMapping("/rest/item")
public class ItemRestController {
	@Autowired
	private IItemService service;
	
	@PostMapping("/insert")
	public ResponseEntity<String> saveItem(@RequestBody Item item){
		ResponseEntity<String> resp=null;
		try {
			Integer id=service.saveItem(item);
			resp=new ResponseEntity<String>("Item '"+id+"' created", HttpStatus.OK);
		}catch(Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllItems(){
		
		ResponseEntity<?> resp=null;
		try {
			List<Item> item=service.getAllItems();
			if(item!=null && !item.isEmpty()) {
				resp=new ResponseEntity<List<Item>>(item,HttpStatus.OK);
			}else{
				resp=new ResponseEntity<String>("No Data Found",HttpStatus.OK);
			}
		}catch(Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			e.printStackTrace();
		}
		return resp;
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneCustomer(@PathVariable ("id")Integer cid){
		ResponseEntity<?> resp=null;
		try {
			Item it=service.getOneItem(cid);
			if(it!=null)
				resp=new ResponseEntity<Item>(it, HttpStatus.OK);
			else
				resp=new ResponseEntity<String>("No Data Found", HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteOneItem(@PathVariable("id")Integer id) {
		ResponseEntity<String> resp=null;
		try {
			service.deleteItem(id);
			resp=new ResponseEntity<String>("Deleted '"+id+"' Successfully", HttpStatus.OK);
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Unable to Delete/Id Not Found", HttpStatus.BAD_REQUEST);
			e.printStackTrace();
		}
		return resp;
	}
	@PutMapping("/update")
	public ResponseEntity<?> updateItem() {
		return new ResponseEntity<String>("Under development", HttpStatus.OK);
	}
}
