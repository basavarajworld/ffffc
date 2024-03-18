package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Item;
import repo.ItemRepository;

import java.util.List;

@Service
public class ItemService {
    
    private final ItemRepository itemRepository;
    
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }
    
    // You can add more methods as per your business requirements
}

