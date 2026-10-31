package com.exemplo.biblioteca.model.service;

import com.exemplo.biblioteca.model.entity.AutorEntity;
import com.exemplo.biblioteca.model.entity.CategoriaEntity;
import com.exemplo.biblioteca.model.entity.LivroEntity;
import com.exemplo.biblioteca.model.repository.AutorRepository;
import com.exemplo.biblioteca.model.repository.CategoriaRepository;
import com.exemplo.biblioteca.model.repository.LivroRepository;
import com.exemplo.biblioteca.view.dto.CategoriaResponse;
import com.exemplo.biblioteca.view.dto.LivroCreateRequest;
import com.exemplo.biblioteca.view.dto.LivroResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class LivroService {
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;
    private final CategoriaRepository categoriaRepository;

    @Transactional
    public List<LivroResponse> verTodosLivros(){
        return livroRepository.findAll().stream().map(this::toResponse).toList();
    }

    @Transactional
    public LivroResponse cadastrarLivro(LivroCreateRequest request){
        AutorEntity autor = autorRepository.findById(request.autorId()).
                orElseThrow(() -> new RuntimeException("Autor não encontrado com o ID: " + request.autorId()));

        Set<CategoriaEntity> categorias = new HashSet<>();
        if (request.categoriasIds() != null && !request.categoriasIds().isEmpty()) {
            categorias = new HashSet<>(categoriaRepository.findAllById(request.categoriasIds()));
        }else{
            throw  new RuntimeException("Existem ids que não existem nessa categoria");
        }

        LivroEntity lient = new LivroEntity(request.titulo(), request.isbn(), request.anoPublicacao(), autor);
        lient.setCategorias(categorias);

        LivroEntity salvar = livroRepository.save(lient);
        return toResponse(salvar);
    }

    @Transactional
    public LivroResponse buscarPorId(Long id){
        LivroEntity li = livroRepository.findById(id).orElseThrow(() -> new RuntimeException("ID não encontrado"));
        return toResponse(li);
    }

    private LivroResponse toResponse(LivroEntity li){
        return new LivroResponse(
                li.getId(),li.getTitulo(), li.getIsbn(), li.getAnoPublicacao(),
                li.getAutor().getId(), li.getAutor().getNome(),
                li.getCategorias().stream()
                        .map(cat -> new LivroResponse.CategoriaResumo(cat.getId(), cat.getNome()))
                        .collect(java.util.stream.Collectors.toSet())
        );
    }

}
