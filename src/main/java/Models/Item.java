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
    @Column(name = "Item_id")
    Integer item_id;

    @Column(name = "Item_name")
    String item_name;

    @Column(name = "price")
    Float item_price;

    @ManyToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
    Invoice invoice;
}
