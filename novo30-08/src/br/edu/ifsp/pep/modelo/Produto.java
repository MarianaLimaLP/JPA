package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="produto")
public class Produto {
    @Id
    @Column (name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "descricao", length=60, nullable = false)
    private String descricao;
    
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    
    @Column(name = "preco", precision = 8, scale = 2, nullable = false)
    private BigDecimal preco;

    public Produto() {
    }

    public Produto(String descricao, Integer quantidade, BigDecimal preco) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + "" + id + ", " + descricao + ", " + quantidade + " produtos, R$ " + preco + ".\n";
    }
    
}
