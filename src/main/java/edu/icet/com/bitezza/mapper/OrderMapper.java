package edu.icet.com.bitezza.mapper;

import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.model.entity.OrderItem;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMapper {


    public static Order toEntity(OrderDTO dto) {
        if (dto == null) return null;

        Order order = new Order();
        order.setOrderId(dto.getOrderId());
        order.setOrderStatus(dto.getOrderStatus());
        order.setServiceType(dto.getServiceType()); // <-- added
        order.setTotalValue(dto.getTotalValue());

        if (dto.getItems() != null) {
            order.setItems(
                    dto.getItems()
                            .stream()
                            .map(itemDTO -> OrderItemMapper.toEntity(itemDTO, order))
                            .collect(Collectors.toList())
            );
        }

        return order;
    }

    public static OrderDTO toDTO(Order order) {
        if (order == null) return null;

        OrderDTO dto = new OrderDTO();
        dto.setOrderId(order.getOrderId());
        dto.setOrderStatus(order.getOrderStatus());
        dto.setServiceType(order.getServiceType()); // <-- added
        dto.setTotalValue(order.getTotalValue());

        if (order.getItems() != null) {
            dto.setItems(order.getItems()
                    .stream()
                    .map(OrderItemMapper::toDTO)
                    .toList()
            );
        }

        return dto;
    }


}
