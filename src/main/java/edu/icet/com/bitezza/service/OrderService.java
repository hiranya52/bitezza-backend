package edu.icet.com.bitezza.service;

import edu.icet.com.bitezza.mapper.OrderMapper;
import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderDTO addOrder(OrderDTO order) {

        Order order1 = orderRepository.save(OrderMapper.toEntity(order));
        return OrderMapper.toDTO(order1);

    }

}
