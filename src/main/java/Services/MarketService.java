package Services;

import Models.Market;
import Repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MarketService {
    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAllMarkets() {
        return marketRepository.findAll();
    }
}
