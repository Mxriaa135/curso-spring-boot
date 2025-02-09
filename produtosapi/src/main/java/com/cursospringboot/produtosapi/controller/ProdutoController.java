package com.cursospringboot.produtosapi.controller;

import com.cursospringboot.produtosapi.Repository.ProdutoRepository;
import com.cursospringboot.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
