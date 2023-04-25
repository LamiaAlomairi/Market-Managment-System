package com.MarketManagementSystem.MarketManagementSystem.Controllers;

import com.MarketManagementSystem.MarketManagementSystem.Models.Customer;
import com.MarketManagementSystem.MarketManagementSystem.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }
    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Integer id) {
        return customerService.getCustomerById(id);
    }

}
