package Services;

import Controllers.ItemController;
import Models.Invoice;
import Models.Item;
import Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemService {
    @Autowired
    ItemRepository itemRepository;
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
