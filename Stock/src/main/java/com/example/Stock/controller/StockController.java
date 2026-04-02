package com.example.Stock.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.Stock.model.Stock;
import com.example.Stock.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

    // Injeção de dependencias
    private final StockService stockService;

    public StockController(StockService stockService){
        this.stockService = stockService;
    }

    @GetMapping
    public List<Stock> getAll(){
        return stockService.getAll();
    }

    @PostMapping
    public Stock created(@RequestBody Stock stock){
        return stockService.save(stock);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        stockService.delete(id);
    }

}
