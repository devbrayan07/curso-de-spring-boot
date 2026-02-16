package com.curso_de_spring_boot.cursospringboot.repository;

import com.curso_de_spring_boot.cursospringboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNomeProduto(String nome); // método para buscar o produto por nome
}
