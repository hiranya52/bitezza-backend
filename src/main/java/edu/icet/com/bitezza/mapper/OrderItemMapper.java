package edu.icet.com.bitezza.mapper;

import edu.icet.com.bitezza.model.dto.OrderItemDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.model.entity.OrderItem;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemDTO dto, Order order) {
        if (dto == null) return null;

        OrderItem item = new OrderItem();
        item.setProductId(dto.getProductId());
        item.setQuantity(dto.getQuantity());
        item.setPrice(dto.getPrice());
        item.setOrder(order);

        return item;
    }

    public static OrderItemDTO toDTO(OrderItem entity) {
        if (entity == null) return null;

        OrderItemDTO dto = new OrderItemDTO();
        dto.setProductId(entity.getProductId());
        dto.setQuantity(entity.getQuantity());
        dto.setPrice(entity.getPrice());

        return dto;
    }

}
