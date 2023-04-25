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
    @Column(name = "Invoice_id")
    Integer invoice_id;

    @Column(name = "Invoice_date")
    String invoice_date;

    @Column(name = "Price")
    Float price;

    @Column(name = "Amount")
    Float amount;

//    @ManyToOne
//    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
//    Customer customer;
//
//    @ManyToMany
//    @JoinTable(
//            name = "invoice_item",
//            joinColumns = @JoinColumn(name = "invoice_id"),
//            inverseJoinColumns = @JoinColumn(name = "item_id"))
//    List<Item> items;
//
//
//    @ManyToOne
//    @JoinColumn(name = "market_id", referencedColumnName = "market_id")
//    Market market;
}
