package org.boardGamesShop.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order extends AuditingEntity<Long> {

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private CartGoods cartGoods;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Instant reservationEndDate;

    public void setCartGoods(CartGoods cartGoods) {
        cartGoods.setOrder(this);
        this.cartGoods = cartGoods;
    }
}
