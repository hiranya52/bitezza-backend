package edu.icet.com.bitezza.repository;

import edu.icet.com.bitezza.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,String> {

    @Query("select coalesce(max(o.orderId), 0) from Order o")
    int findLastOrderId();

}
