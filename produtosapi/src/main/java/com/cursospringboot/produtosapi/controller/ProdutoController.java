package com.cursospringboot.produtosapi.controller;

import com.cursospringboot.produtosapi.Repository.ProdutoRepository;
import com.cursospringboot.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){

        var id = UUID.randomUUID() .toString();
        produto.setId(id);

        produtoRepository.save(produto);
        System.out.println("Produto recebido: " + produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable String id){
    //    Optional<Produto> produto = produtoRepository.findById(id);
    //    return produto.isPresent() ? produto.get() : null;
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable("id") String id, @RequestBody Produto produto){

        produto.setId(id);
        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }
}
