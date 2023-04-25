package com.MarketManagementSystem.MarketManagementSystem.Repositories;

import com.MarketManagementSystem.MarketManagementSystem.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {

}
