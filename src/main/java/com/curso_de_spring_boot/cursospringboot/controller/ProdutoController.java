package com.curso_de_spring_boot.cursospringboot.controller;


import com.curso_de_spring_boot.cursospringboot.model.Produto;
import com.curso_de_spring_boot.cursospringboot.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController // vai receber requisições REST nessa classe
@RequestMapping("produtos") // vai dizer qual url base do controller
public class ProdutoController {

    private ProdutoRepository produtoRepository;


    public ProdutoController(ProdutoRepository produtoRepository) {
            this.produtoRepository = produtoRepository;
        }


    // MÉTODO PARA SALVAR UM PRODUTO
    @PostMapping // Envia dados / salva dados
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString(); //  gera um código hash único no banco de dados
        produto.setIdProduto(id);

        produtoRepository.save(produto);
        return produto;
    }


    // MÉTODO PARA CONSULTAR UM PRODUTO
    @GetMapping("{id}") // pode adicionar mais de um parâmetro
    public Produto consultarPorId(@PathVariable("id") String id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.isPresent() ? produto.get() : null; // verifica se o produto existe, caso não tenha nada retorna null
    }


    // MÉTODO PARA DELETAR UM PRODUTO
    @DeleteMapping("{id}") // serve para mapear uma requisição de deleção
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    // MÉTODO PARA ATUALIZAR UM PRODUTO
    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto) {
        produto.setIdProduto(id);
        produtoRepository.save(produto);
    }

    // MÉTODO PARA BUSCAR PRODUTOS
    @GetMapping
    public List<Produto> buscarProdutos(@RequestParam("nome") String nome) {
         return produtoRepository.findByNomeProduto(nome);
    }
}
