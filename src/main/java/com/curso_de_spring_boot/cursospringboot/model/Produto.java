package com.curso_de_spring_boot.cursospringboot.model;


// POJO - Plain OLd Java Object

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // mapea a entidade Produto
@Table(name = "produto") // é opcional, serve para se referir a tabela do banco
public class Produto {

    @Id // serve para identificar a coluna que possui a primary key
    @Column(name = "id") // serve para mapear as colunas do banco de dados
    private String idProduto;


    @Column(name = "nome")
    private String nomeProduto;


    @Column(name = "descricao")
    private String descricao;


    @Column(name = "preco")
    private double preco;


    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String  getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto='" + idProduto + '\'' +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
