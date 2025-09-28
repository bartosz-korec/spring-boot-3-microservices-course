package com.bartoszkorec.microservices.order.repository;

import com.bartoszkorec.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
