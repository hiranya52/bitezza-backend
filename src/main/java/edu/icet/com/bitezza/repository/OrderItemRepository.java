package edu.icet.com.bitezza.repository;

import edu.icet.com.bitezza.model.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
}
