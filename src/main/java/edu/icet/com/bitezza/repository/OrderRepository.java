package edu.icet.com.bitezza.repository;

import edu.icet.com.bitezza.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String > {

}
