package com.star.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.star.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
