package com.MarketManagementSystem.MarketManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "market_id")
    int id;

    @Column(name = "market_name")
    String name;

    @OneToMany(mappedBy = "market")
    private List<Customer> customers;

    @OneToMany(mappedBy = "market")
    private List<Item> items;

    @OneToMany(mappedBy = "market")
    private List<Invoice> invoices;
}
