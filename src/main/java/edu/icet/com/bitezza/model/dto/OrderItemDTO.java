package edu.icet.com.bitezza.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private String productId;

    private Integer quantity;
    private BigDecimal price;

}
