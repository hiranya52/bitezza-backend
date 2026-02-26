package edu.icet.com.bitezza.mapper;

import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.model.entity.OrderItem;
import edu.icet.com.bitezza.model.entity.Product;
import edu.icet.com.bitezza.repository.ProductRepository;

import java.util.stream.Collectors;

public class OrderMapper {

    public static Order toEntity(OrderDTO dto, ProductRepository productRepository) {

        Order order = new Order();

        order.setOrderStatus(dto.getOrderStatus());
        order.setServiceType(dto.getServiceType());
        order.setTotalValue(dto.getTotalValue());

        if (dto.getItems() != null) {
            order.setItems(
                    dto.getItems()
                            .stream()
                            .map(i -> {
                                OrderItem item = new OrderItem();
                                item.setQuantity(i.getQuantity());
                                item.setPrice(i.getPrice());
                                item.setProductName(i.getProductName());
                                item.setOrder(order);

                                Product product = productRepository.findById(i.getProductId())
                                        .orElseThrow(() -> new RuntimeException("Product not found"));
                                item.setProduct(product);

                                return item;
                            })
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
