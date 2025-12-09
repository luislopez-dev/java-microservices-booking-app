
package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * Training Project.
 *
 * @author Luis López
 * @see <a href="https://github.com/luislopez-dev">https://github.com/luislopez-dev</a>
 */
@Entity
@Table(name = "order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
}
