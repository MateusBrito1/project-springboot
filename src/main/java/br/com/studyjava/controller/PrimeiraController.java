package br.com.studyjava.controller;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController //retornar dados no formato JSON em resposta a requisições RESTful.
@RequestMapping("/primeiroController") // Primeira URL
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parâmetro é " + id;
    }

    @GetMapping("/metodoComQuery")
    public String metodoComQuery(@RequestParam Map<String, String> allParams) {
        return "O parâmetro com metodoQueryParams é " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams" + usuario.username();
    }

    record Usuario(String username) {
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name){
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers){
        return "metodoComHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id) {
        var username = new Usuario("Mateus Gabriel");
         if (id >= 5) {
             return ResponseEntity.status(HttpStatus.OK).body(username);
         }
         return ResponseEntity.badRequest().body("Número menor do que 5");
    }

    @GetMapping("/badRequest")
    public ResponseEntity<Object> badRequest() {
        return ResponseEntity.badRequest().body("BAD REQUEST ERROR");
    }

    @GetMapping("/statusOK")
    public ResponseEntity<Object> statusOK() {
        return ResponseEntity.status(HttpStatus.OK).body("STATUS OK");
    }

    @GetMapping("/endpoint")
    public ResponseEntity<String> endPoint() {
        String bodyResponse = "Login bem sucedido, Auth aceita.";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Auth", "3333111");

        return new ResponseEntity<>(bodyResponse, headers, HttpStatus.OK);
    }


}
