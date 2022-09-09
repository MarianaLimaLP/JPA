package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id")
    private long id;
    
    @Column(name = "nome", length=50, nullable = false)
    private String nome;

    @Column(name = "salario", precision = 8, scale = 2)
    private BigDecimal salario;

    @Column(name = "data_nascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, BigDecimal salario, Date dataNascimento) {
        this.nome = nome;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return "Pessoa: " + id + ", Nome: " + nome + ", Salario: R$ " + salario + ", Nascimento: "+dataNascimento+"; ";
    }
}
