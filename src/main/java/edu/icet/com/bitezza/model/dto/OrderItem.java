package edu.icet.com.bitezza.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderItem {

    private Long productId;
    private Integer quantity;
    private BigDecimal price;

}
