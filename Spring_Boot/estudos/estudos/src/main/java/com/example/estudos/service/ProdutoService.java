package com.example.estudos.service;

import com.example.estudos.dto.ProdutoCreateRequest;
import com.example.estudos.dto.ProdutoResponse;
import com.example.estudos.dto.ProdutoUpdate;
import com.example.estudos.dto.UserResponse;
import com.example.estudos.entity.ProdutoEntity;
import com.example.estudos.entity.UsersEntity;
import com.example.estudos.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Transactional
    public List<ProdutoResponse> buscarTodos(){
        return produtoRepository.findAll().stream().map(p -> new ProdutoResponse(p.getId(),p.getNomeProduto(),p.getPreco(),p.getQtd())).toList();
    }

    @Transactional
    public ProdutoResponse cadastrarProd(ProdutoCreateRequest request){
        ProdutoEntity prod = new ProdutoEntity(request.nomeProduto(),request.preco(),request.qtd());
        ProdutoEntity salvar = produtoRepository.save(prod);
        return new ProdutoResponse(prod.getId(),prod.getNomeProduto(),prod.getPreco(), prod.getQtd());
    }

    @Transactional
    public void deleteProd(Long id){
        produtoRepository.deleteById(id);
    }

    @Transactional
    public void atualizarProd(Long id, ProdutoUpdate prodU) {
        produtoRepository.findById(id)
                .ifPresentOrElse(p -> {
                    p.setNomeProduto(prodU.nomeProduto());
                    p.setPreco(prodU.preco());
                    p.setQtd(prodU.qtd());
                }, () -> {
                    throw new RuntimeException("Produto não encontrado com o ID: " + id);
                });
    }


    @Transactional
    public List<ProdutoResponse> pesquisarPorNome(String nomeProd){
        Optional<ProdutoEntity> prod = produtoRepository.findByNomeProduto(nomeProd);
        return prod.stream().map(p -> new ProdutoResponse(p.getId(),p.getNomeProduto(),p.getPreco(),p.getQtd())).toList();
    }
}
