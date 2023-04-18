package Models;

import lombok.*;

import javax.persistence.*;
import java.util.*;
@Getter
@Setter
@Data
@Entity
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

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    Customer customer;

    @OneToMany
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    List<Item> items;
}
