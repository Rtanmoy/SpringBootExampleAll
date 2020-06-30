package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.model.Item;
import com.app.repo.ItemRepository;
import com.app.service.IItemService;
@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	private ItemRepository repo;
	@Transactional
	public Integer saveItem(Item i) {
		
		i=repo.save(i);
		return i.getId();
	}

	@Transactional(readOnly = true)
	public List<Item> getAllItems() {
		List<Item> itemlist=repo.findAll();
		if(itemlist!=null && !itemlist.isEmpty()) {
			itemlist.stream()
			.sorted((s1,s2)->s1.getCode()
					.compareTo(s2.getCode()));
		}
		return itemlist;
	}

	@Transactional(readOnly = true)
	public Item getOneItem(Integer id) {
		Optional<Item> op=repo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;

	}

	@Transactional
	public void deleteItem(Integer id) {
		repo.deleteById(id);

	}

}
