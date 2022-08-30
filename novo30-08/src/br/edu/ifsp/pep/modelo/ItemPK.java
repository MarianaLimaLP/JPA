package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemPK implements Serializable{
    
    @Column(name = "venda_id", insertable = false, updatable = false)
    private Integer venda;
    
    @Column(name = "produto_id", insertable = false, updatable = false)
    private Integer produto;

    public Integer getVenda() {
        return venda;
    }

    public void setVenda(Integer venda) {
        this.venda = venda;
    }

    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.venda);
        hash = 79 * hash + Objects.hashCode(this.produto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemPK other = (ItemPK) obj;
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return Objects.equals(this.produto, other.produto);
    }
    
}
