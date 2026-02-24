package edu.icet.com.bitezza.mapper;

import edu.icet.com.bitezza.model.dto.OrderItemDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.model.entity.OrderItem;
import edu.icet.com.bitezza.model.entity.Product;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemDTO dto, Order order) {

        OrderItem item = new OrderItem();

        item.setQuantity(dto.getQuantity());
        item.setPrice(dto.getPrice());
        item.setOrder(order);

        Product product = new Product();
        product.setId(dto.getProductId());   // BIT-100

        item.setProduct(product);

        return item;
    }

    public static OrderItemDTO toDTO(OrderItem item) {

        OrderItemDTO dto = new OrderItemDTO();

        dto.setProductId(item.getProduct().getId());
        dto.setQuantity(item.getQuantity());
        dto.setPrice(item.getPrice());

        return dto;
    }

}
