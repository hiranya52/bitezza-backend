package edu.icet.com.bitezza.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDTO {

    private Long orderId;
    private String orderStatus;
    private BigDecimal totalValue;
    private List<OrderItemDTO> items;

}
