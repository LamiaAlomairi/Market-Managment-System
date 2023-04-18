package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

    String email;

    String address;

    @ManyToOne(fetch = FetchType.LAZY)
    Market market;

}
