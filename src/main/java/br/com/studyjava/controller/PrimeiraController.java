package br.com.studyjava.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/primeiroController")

public class PrimeiraController {
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo () {
        return "Rota iniciada";
    }
}