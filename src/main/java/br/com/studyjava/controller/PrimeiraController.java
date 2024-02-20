package br.com.studyjava.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //retornar dados no formato JSON em resposta a requisições RESTful.
@RequestMapping("/primeiroController") // Primeira URL

public class PrimeiraController {
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "Primeiro metodo acionado";
    }


}
