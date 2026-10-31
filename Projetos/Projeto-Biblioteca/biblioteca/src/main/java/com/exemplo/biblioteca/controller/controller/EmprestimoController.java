package com.exemplo.biblioteca.controller.controller;

import com.exemplo.biblioteca.model.service.EmprestimoService;
import com.exemplo.biblioteca.view.dto.EmprestimoCreateRequest;
import com.exemplo.biblioteca.view.dto.EmprestimoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emprestimo")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    @GetMapping
    public List<EmprestimoResponse> listarTodosEmprestimos(){
        return emprestimoService.listarTodosEmprestimos();
    }

    @PostMapping
    public EmprestimoResponse cadastrar(@RequestBody EmprestimoCreateRequest request){
        return  emprestimoService.cadastrarEmprestimo(request);
    }
}
