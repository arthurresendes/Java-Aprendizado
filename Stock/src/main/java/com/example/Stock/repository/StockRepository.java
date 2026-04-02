package com.example.Stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Stock.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Long>{
    
}
