package com.exemplo.biblioteca.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration // Define que é uma config para o spring
@EnableCaching // Liga o motor de cache do Spring. Sem essa linha, o Spring ignora todas as anotações @Cacheable e @CacheEvict
public class CacheCaffeine {
    @Bean // Diz para pegar o objeto que este método criou e guarde dentro do sistema para você usar sempre que precisar
    public CacheManager cacheManager() {
        // Cria uma instancia do Caffeine e separa partes para memoria ram especifica de cache
        CaffeineCacheManager cacheManager = new CaffeineCacheManager("livros", "users", "autores", "categorias","emprestimo" );


        cacheManager.setCaffeine(Caffeine.newBuilder()
                .maximumSize(500) // Define que cada gaveta guarda no máximo 500 itens. Se entrar o 501º item, o Caffeine apaga o item que está há mais tempo sem uso para abrir espaço e evitar estourar a memória RAM
                .expireAfterAccess(5, TimeUnit.MINUTES)); //Se um item ficar 5 minutos inteiros sem ninguém consultar, ele é apagado da memória

        return cacheManager; // Entrega o gerenciador para utilizar
    }
}
