package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="item")
public class Item implements Serializable {
    
    @EmbeddedId
    private ItemPK itemPK;
    
    @ManyToOne
    @JoinColumn (name="venda_id", nullable = false)
    private Venda venda;
    @ManyToOne
    @JoinColumn(name="produto_id", nullable = false)
    private Produto produto;

    @Column (name="quantidade", nullable = false)
    private Integer quantidade;
    
    @Column(name = "preco", precision = 8, scale = 2, nullable = false)
    private BigDecimal preco;

    public Item() {
    }

    public Item(Venda venda, Produto produto, Integer quantidade, BigDecimal preco) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public ItemPK getItemPK() {
        return itemPK;
    }

    public void setItemPK(ItemPK itemPK) {
        this.itemPK = itemPK;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
        return "Item: " + quantidade + " itens, R$ " + preco + " \n";
    }
    
}
