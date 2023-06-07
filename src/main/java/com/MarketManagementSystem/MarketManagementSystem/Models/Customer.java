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
    Integer id;
    String name;
    Integer phone;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    List<Invoice> invoices;

}
