package com.MarketManagementSystem.MarketManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    List<Invoice> invoices;

}
