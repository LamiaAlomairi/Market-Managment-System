package com.MarketManagementSystem.MarketManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    Integer id;

    @Column(name = "item_name")
    String name;

    @Column(name = "item_price")
    Float price;

//    @ManyToOne
//    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
//    Invoice invoice;
}
