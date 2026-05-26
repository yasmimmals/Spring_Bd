package dc.unifacef.bd.service;


import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    // essa classe vai usar o ProdutoRepository explorando a injeção de dependência pelo construtor
    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }
    // recupera todos os produtos
    public List<Produto> listar(){
        return repo.findAll();
    }
}
