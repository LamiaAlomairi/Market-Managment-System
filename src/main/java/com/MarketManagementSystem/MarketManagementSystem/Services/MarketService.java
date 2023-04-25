package com.MarketManagementSystem.MarketManagementSystem.Services;


import com.MarketManagementSystem.MarketManagementSystem.Models.Market;
import com.MarketManagementSystem.MarketManagementSystem.Repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAllMarkets() {

        return marketRepository.findAll();
    }

    public Market getMarketById(int id) {

        return marketRepository.findById(id).get();
    }
}
