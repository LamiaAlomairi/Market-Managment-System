package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Invoice id")
    Integer invoice_id;
    @Column(name = "Invoice date")
    String invoice_date;
    @Column(name = "Price")
    Float price;
    @Column(name = "Amount")
    Float amount;
    Data data;

    @ManyToOne
    @JoinColumn(name = "market_id", referencedColumnName = "id")
    Market market;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    Customer customer;
}
