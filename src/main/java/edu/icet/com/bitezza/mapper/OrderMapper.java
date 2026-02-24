package edu.icet.com.bitezza.mapper;

import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.model.entity.OrderItem;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMapper {


    // DTO → Entity
    public static Order toEntity(OrderDTO dto) {
        if (dto == null) return null;
        Order order = new Order();
        order.setOrderId(dto.getOrderId());
        order.setOrderStatus(dto.getOrderStatus());
        order.setTotalValue(dto.getTotalValue());

        if (dto.getItems() != null) {

            List<OrderItem> items = dto.getItems()
                    .stream()
                    .map(itemDTO ->
                            OrderItemMapper.toEntity(itemDTO, order)
                    )
                    .collect(Collectors.toList());

            order.setItems(items);
        }

        return order;
    }



}
