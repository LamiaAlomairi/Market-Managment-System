package Controllers;

import Models.Market;
import Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("market")
public class MarketController {
    @Autowired
    MarketService marketService;

    @GetMapping("getAll")
    public List<Market> getMarkets() {
        return marketService.getAllMarkets();
    }

    @GetMapping("getById")
    public Market getMarketById(@RequestParam int id) {
        return marketService.getMarketById(id);
    }

//    @RequestMapping(value = "getAll", method = RequestMethod.GET)
//    public List<Market> getMarkets() {
//        return marketService.getAllMarkets();
//    }
//
//    @GetMapping(value = "getById")
//    public Market getMarketById(@RequestParam Integer id) {
//        return marketService.getMarketById(id);
//    }

}
