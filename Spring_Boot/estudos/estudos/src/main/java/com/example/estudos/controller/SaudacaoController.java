package com.example.estudos.controller;

import com.example.estudos.service.SaudacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/saudacao")
public class SaudacaoController {
    private final SaudacaoService saudacaoService;

    @GetMapping
    public String saudar(@RequestParam String nome){
        return saudacaoService.saudacao(nome);
    }

    @GetMapping("/{nome}")
    public String saudarPorPath(@PathVariable String nome){
        return  saudacaoService.saudacao(nome);
    }
}
