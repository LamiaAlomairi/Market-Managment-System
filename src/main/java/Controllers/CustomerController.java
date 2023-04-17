package Controllers;

import Models.Customer;
import Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> findInvoices() {
        return customerService.getAllCustomers();
    }

}
