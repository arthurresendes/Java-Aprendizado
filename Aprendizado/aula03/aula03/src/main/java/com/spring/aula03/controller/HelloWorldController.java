package com.spring.aula03.controller;

import com.spring.aula03.domain.User;
import com.spring.aula03.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // Usa controller + ResponseBody
/*
@Controller
@ResponseBody ->  Vira um JSON ou XML automaticamente
* */
@RequestMapping("/hello-world")
@RequiredArgsConstructor
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    /*
    @Autowired
    private HelloWorldService helloWorldService;
    * */
    @GetMapping("/{nome}")
    public String olaMundo(@PathVariable("nome") String nome){
        return helloWorldService.olaMundo(nome);
    }

    @GetMapping("/filtro")
    public String olaMundoFiltro(@RequestParam(value = "filter", defaultValue = "nenhum") String filter){
        return helloWorldService.olaMundoFilter() + filter;
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User us){
        return helloWorldService.helloWorldPost(us);
    }

}
