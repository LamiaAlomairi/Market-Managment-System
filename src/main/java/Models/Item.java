package Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer item_id;
    String item_name;
    Float item_price;

    @ManyToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    Invoice invoice;
}
