package com.example.CustomCarsToOrder.Dao;

import com.example.CustomCarsToOrder.Dto.OrdersInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdersInventoryRepository extends JpaRepository<OrdersInventory, Integer> {
    List<OrdersInventory> findByOrdDetailId(Integer id);
}

