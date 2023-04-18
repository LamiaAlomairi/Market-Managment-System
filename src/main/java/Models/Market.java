package Models;

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

    @Column(name = "Market_id")
    Integer id;

    @Column(name = "Market_name")
    String market_name;

    @OneToMany
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
    List<Invoice> invoices;
}
