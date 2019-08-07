package com.example.CustomCarsToOrder.Dao;

import com.example.CustomCarsToOrder.Dto.OrdersMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdersMasterRepository extends JpaRepository<OrdersMaster, Integer> {
    List<OrdersMaster> findByOrdId(Integer id);
}