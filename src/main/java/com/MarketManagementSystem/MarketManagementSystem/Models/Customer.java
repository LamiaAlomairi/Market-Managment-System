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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Customer_id")
    Integer customer_id;
    @Column(name = "Customer_name")
    String customer_name;
    @Column(name = "Phone_number")
    Integer phone;

    @ManyToOne
    @JoinColumn(name = "market_id", referencedColumnName = "market_id")
    Market market;

    @OneToMany(mappedBy = "customer")
    List<Invoice> invoices;

}
