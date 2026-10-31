package com.springia.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping()
    public String seriaA(@RequestParam(value = "message", defaultValue = "Qual os times na seria A do brasileirao nesse ano") String message){
        return chatClient.prompt()
                .user(message).call().content();
    }

    @GetMapping("/laliga")
    public String laLiga(@RequestParam(value = "message", defaultValue = "Qual os times na seria A da laLiga nesse ano") String message){
        return chatClient.prompt(new Prompt(message)).call().content();
    }

    @GetMapping("/seriatim")
    public String seriatim(@RequestParam(value = "time", defaultValue = "Qual os times na seria A TIM nesse ano") String time){
        PromptTemplate promptTemplate = new PromptTemplate("Forneça os times e os pontos com os saldos de gol do {time}");
        promptTemplate.add("time", time);
        return this.chatClient.prompt(promptTemplate.create()).call().content();
    }

    @GetMapping("/bundesliga")
    public Flux<String> bundesliga(@RequestParam(value = "time", defaultValue = "Qual os times na bundesliga nesse ano") String time){
        return chatClient.prompt()
                .user(time).stream().content();
    }


}
