package kitchenpos.menu.adapter.out.persistence;

import kitchenpos.product.adapter.out.persistence.ProductEntity;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "menu_product")
@Entity
public class MenuProductEntity {
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long seq;

//    @ManyToOne(optional = false)
//    @JoinColumn(
//        name = "product_id",
//        columnDefinition = "binary(16)",
//        foreignKey = @ForeignKey(name = "fk_menu_product_to_product")
//    )
//    private ProductEntity product;

    @Column(name = "quantity", nullable = false)
    private long quantity;

    @Transient
    private UUID productId;

    public MenuProductEntity() {}

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

//    public ProductEntity getProduct() {
//        return product;
//    }
//
//    public void setProduct(ProductEntity product) {
//        this.product = product;
//    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }
}
