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

    Integer invoice_id;
    String invoice_date;
    Float price;
    Float amount;

    @ManyToOne
    @JoinColumn(name = "market_id", referencedColumnName = "id")
    Market market;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    Customer customer;
}
