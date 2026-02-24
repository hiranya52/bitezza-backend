package edu.icet.com.bitezza.model.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDTO {

    private Long orderId;
    private String orderStatus;
    private String serviceType;
    private BigDecimal totalValue;
    private List<OrderItemDTO> items;

}
