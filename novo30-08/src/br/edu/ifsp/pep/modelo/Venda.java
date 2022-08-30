package br.edu.ifsp.pep.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name="venda")
public class Venda {
    @Id
    @Column (name="id")
    private Integer id;
    
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public Venda() {
    }

    public Venda(int id, Date data) {
        this.id = id;
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

}
