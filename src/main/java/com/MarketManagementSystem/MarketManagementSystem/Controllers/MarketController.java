package com.MarketManagementSystem.MarketManagementSystem.Controllers;

import com.MarketManagementSystem.MarketManagementSystem.Models.Market;
import com.MarketManagementSystem.MarketManagementSystem.Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "market")
public class MarketController {
    //http://localhost:8080/market/getAll
    @Autowired
    MarketService marketService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Market> getAllMarkets() {

        return marketService.getAllMarkets();
    }

    @GetMapping(value = "getById")
    public Market getMarketById(@RequestParam int id) {
        return marketService.getMarketById(id);
    }
}
