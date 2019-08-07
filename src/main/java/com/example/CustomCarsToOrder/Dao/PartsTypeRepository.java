package com.example.CustomCarsToOrder.Dao;

import com.example.CustomCarsToOrder.Dto.PartsType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartsTypeRepository extends JpaRepository<PartsType, Integer> {
    List<PartsType> findByPrtId(Integer id);
}
