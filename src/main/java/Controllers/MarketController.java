package Controllers;

import Models.Market;
import Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "market")
public class MarketController {
    @Autowired
    MarketService marketService;



    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Market> findMarkets() {
        return marketService.getAllMarkets();
    }
}
