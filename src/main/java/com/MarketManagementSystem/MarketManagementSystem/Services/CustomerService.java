package com.MarketManagementSystem.MarketManagementSystem.Services;

import com.MarketManagementSystem.MarketManagementSystem.Models.Customer;
import com.MarketManagementSystem.MarketManagementSystem.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).get();
    }
}
