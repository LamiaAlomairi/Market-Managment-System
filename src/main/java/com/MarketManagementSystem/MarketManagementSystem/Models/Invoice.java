package com.MarketManagementSystem.MarketManagementSystem.Models;

import lombok.*;

import javax.persistence.*;
import java.util.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String date;
    Float paidAmount;
    Float amount;

    @ManyToOne
    @JoinColumn(name = "Customer_id", referencedColumnName = "id")
    Customer customer;

    @ManyToMany
    @JoinTable(name = "invoice_item", joinColumns = @JoinColumn(name = "invoice_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    List<Item> items;

    @ManyToOne
    @JoinColumn(name = "market_id", referencedColumnName = "id")
    Market market;
}
