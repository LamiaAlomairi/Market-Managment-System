package com.MarketManagementSystem.MarketManagementSystem.Controllers;

import com.MarketManagementSystem.MarketManagementSystem.Models.Item;
import com.MarketManagementSystem.MarketManagementSystem.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "item")
public class ItemController {
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @Autowired
    ItemService itemService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping(value = "getById")
    public Item getItemById(@RequestParam Integer id) {
        return itemService.getItemById(id);
    }
}
