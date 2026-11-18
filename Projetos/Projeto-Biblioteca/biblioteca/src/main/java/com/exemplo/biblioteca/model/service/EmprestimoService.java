package com.exemplo.biblioteca.model.service;

import com.exemplo.biblioteca.exception.ResourceNotFoundException;
import com.exemplo.biblioteca.model.entity.EmprestimoEntity;
import com.exemplo.biblioteca.model.entity.LivroEntity;
import com.exemplo.biblioteca.model.entity.UserEntity;
import com.exemplo.biblioteca.model.repository.EmprestimoRepository;
import com.exemplo.biblioteca.model.repository.LivroRepository;
import com.exemplo.biblioteca.model.repository.UserRepository;
import com.exemplo.biblioteca.view.dto.EmprestimoCreateRequest;
import com.exemplo.biblioteca.view.dto.EmprestimoResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;
    private final LivroRepository livroRepository;
    private final UserRepository userRepository;

    @Transactional
    @Cacheable(value = "emprestimo", key = "'todos'")
    public List<EmprestimoResponse> listarTodosEmprestimos(){
        return emprestimoRepository.findAll().stream().map(em -> new EmprestimoResponse(em.getId(),em.getDataEmprestimo(),
                em.getDataPrevistaDevolucao(),em.getDataDevolucao(),
                em.getLivro().getId(), em.getLivro().getTitulo(),em.getLivro().getAutor().getNome(),
                em.getUser().getId(), em.getUser().getNome())).toList();
    }

    @Transactional()
    @Cacheable(value = "emprestimo", key = "#id")
    public EmprestimoResponse listarEmprestimoPorId(Long id){
        return emprestimoRepository.findById(id).map(em -> new EmprestimoResponse(em.getId(), em.getDataEmprestimo(),
                em.getDataPrevistaDevolucao(), em.getDataDevolucao(), em.getLivro().getId(), em.getLivro().getTitulo(), em.getLivro().getAutor().getNome(),
                em.getUser().getId(), em.getUser().getNome())).orElseThrow(() -> new ResourceNotFoundException("Id de emprestimo não encontrado"));
    }

    @Transactional
    @CacheEvict(value = "emprestimo", allEntries = true)
    public EmprestimoResponse cadastrarEmprestimo(EmprestimoCreateRequest request){
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataPrevistaDevolucao = dataAtual.plusDays(14);

        LivroEntity livro = livroRepository.findById(request.livroId()).
                orElseThrow(() -> new ResourceNotFoundException("Livro não encontrado com o ID: " + request.livroId()));

        UserEntity user = userRepository.findById(request.userId()).
                orElseThrow(() -> new ResourceNotFoundException("User não encontrado com o ID: " + request.userId()));

        EmprestimoEntity em = new EmprestimoEntity(dataAtual, dataPrevistaDevolucao, livro, user);
        EmprestimoEntity salvar = emprestimoRepository.save(em);
        return new EmprestimoResponse(salvar.getId(),salvar.getDataEmprestimo(),salvar.getDataPrevistaDevolucao(),salvar.getDataDevolucao(),
                salvar.getLivro().getId(), salvar.getLivro().getTitulo(), salvar.getLivro().getAutor().getNome(),
                salvar.getUser().getId(), salvar.getUser().getNome());

    }


}
