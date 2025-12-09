
package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Training Project.
 *
 * @author Luis López
 * @see <a href="https://github.com/luislopez-dev">https://github.com/luislopez-dev</a>
 */
@Entity
@Table(name = "order_item")
@Data
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private BigDecimal price;

    private Integer orderQty;
}
