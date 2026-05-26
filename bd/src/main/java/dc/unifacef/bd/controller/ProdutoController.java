package dc.unifacef.bd.controller;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        List<Produto> resposta = service.listar();
        if(!resposta.isEmpty()) {
            return ResponseEntity.ok(service.listar());
        }
        return ResponseEntity.noContent().build(); // sem produto no banco
    }
}
