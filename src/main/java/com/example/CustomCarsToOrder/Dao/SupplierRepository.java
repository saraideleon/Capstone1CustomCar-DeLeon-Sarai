package com.example.CustomCarsToOrder.Dao;

import com.example.CustomCarsToOrder.Dto.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SupplierRepository extends JpaRepository<Suppliers, Integer> {
    List<Suppliers> findBySupplierId(Integer id);
}

