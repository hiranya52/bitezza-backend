package edu.icet.com.bitezza.model.dto;

import edu.icet.com.bitezza.model.enums.OrderStatus;
import edu.icet.com.bitezza.model.enums.ServiceType;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long orderId;
    private OrderStatus orderStatus;
    private ServiceType serviceType;
    private BigDecimal totalValue;

    private List<OrderItemDTO> items;



}
