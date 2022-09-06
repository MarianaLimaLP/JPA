package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "banco")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Banco implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id")
    private long id;
    
    @Column(name = "nome", length=50, nullable = false)
    private String nome;

}
