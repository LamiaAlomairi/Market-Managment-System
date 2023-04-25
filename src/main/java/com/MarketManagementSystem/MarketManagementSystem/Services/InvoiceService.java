package com.MarketManagementSystem.MarketManagementSystem.Services;

import com.MarketManagementSystem.MarketManagementSystem.Models.Invoice;
import com.MarketManagementSystem.MarketManagementSystem.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {

        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(Integer id) {

        return invoiceRepository.findById(id).get();
    }
}
