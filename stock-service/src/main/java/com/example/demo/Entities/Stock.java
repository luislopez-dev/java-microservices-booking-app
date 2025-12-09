
package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Training Project.
 *
 * @author Luis López
 * @see <a href="https://github.com/luislopez-dev">https://github.com/luislopez-dev</a>
 */
@Entity
@Table(name = "stock")
@NoArgsConstructor
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private Integer quantity;
}
