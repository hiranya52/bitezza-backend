package edu.icet.com.bitezza.mapper;

import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.entity.Order;

import java.util.stream.Collectors;

public class OrderMapper {

    public static Order toEntity(OrderDTO dto) {

        Order order = new Order();

        order.setOrderId(dto.getOrderId());
        order.setOrderStatus(dto.getOrderStatus());
        order.setServiceType(dto.getServiceType());
        order.setTotalValue(dto.getTotalValue());

        if (dto.getItems() != null) {
            order.setItems(
                    dto.getItems()
                            .stream()
                            .map(i -> OrderItemMapper.toEntity(i, order))
                            .collect(Collectors.toList())
            );
        }

        return order;
    }

    public static OrderDTO toDTO(Order order) {

        OrderDTO dto = new OrderDTO();

        dto.setOrderId(order.getOrderId());
        dto.setOrderStatus(order.getOrderStatus());
        dto.setServiceType(order.getServiceType());
        dto.setTotalValue(order.getTotalValue());

        if (order.getItems() != null) {
            dto.setItems(
                    order.getItems()
                            .stream()
                            .map(OrderItemMapper::toDTO)
                            .toList()
            );
        }

        return dto;
    }
}
