package com.MarketManagementSystem.MarketManagementSystem.Repositories;

import com.MarketManagementSystem.MarketManagementSystem.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
