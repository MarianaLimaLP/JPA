package br.edu.ifsp.pep.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name="venda")
public class Venda {
    @Id
    @Column (name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @OneToMany(mappedBy = "venda", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) 
    private List<Item> itens = new ArrayList<>();
    
    public Venda() {
    }

    public Venda(Date data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Venda: " + "" + id + ", Data: " + data + ";\n"+itens+".\n";
    }
    
}
