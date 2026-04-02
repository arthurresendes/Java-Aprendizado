package com.example.Stock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Stock.model.Stock;
import com.example.Stock.repository.StockRepository;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }


    public List<Stock> getAll() {
        return stockRepository.findAll();
    }

    public Stock save(Stock stock){
        return stockRepository.save(stock);
    }

    public void delete(Long id){
        stockRepository.deleteById(id);
    }
}
