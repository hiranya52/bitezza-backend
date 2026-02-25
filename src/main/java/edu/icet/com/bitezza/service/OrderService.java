package edu.icet.com.bitezza.service;

import edu.icet.com.bitezza.mapper.OrderMapper;
import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.model.entity.OrderItem;
import edu.icet.com.bitezza.model.entity.Product;
import edu.icet.com.bitezza.repository.OrderRepository;
import edu.icet.com.bitezza.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

//    public OrderDTO addOrder(OrderDTO order) {
//
//        Order order1 = orderRepository.save(OrderMapper.toEntity(order));
//        return OrderMapper.toDTO(order1);
//
//    }

    @Transactional
    public OrderDTO addOrder(OrderDTO dto) {
        Order order = new Order();

        order.setOrderStatus(dto.getOrderStatus());
        order.setServiceType(dto.getServiceType());
        order.setTotalValue(dto.getTotalValue());

        if (dto.getItems() != null) {
            List<OrderItem> items = dto.getItems().stream().map(i -> {
                OrderItem item = new OrderItem();
                item.setQuantity(i.getQuantity());
                item.setPrice(i.getPrice());
                item.setOrder(order);

                Product product = productRepository.findById(i.getProductId())
                        .orElseThrow(() -> new RuntimeException("Product not found"));
                item.setProduct(product);

                return item;
            }).collect(Collectors.toList());

            order.setItems(items);
        }

        Order saved = orderRepository.save(order); // <-- this inserts new order + items
        return OrderMapper.toDTO(saved);
    }

    public int getLastOrderId() {


    }
}
