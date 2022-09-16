package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "veiculo", uniqueConstraints = {
    @UniqueConstraint(name = "UniquePlacaAndCidade",
            columnNames = {"placa", "cidade"})}) //para que placa e cidade nao sejam unicos junto
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@DiscriminatorValue(value = "VEICULO")
public abstract class Veiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;

    @Column (name="placa")
    private String placa;
    
    @Column (name="cidade", length = 30)
    private String cidade;
    
    @Column (name="modelo", length = 50, nullable = false)
    private String modelo;
    
    @Column (name="ano", nullable = false)
    private int ano;
    
    @Column(name = "salario", precision = 8, scale = 2, nullable = false)
    protected BigDecimal valor_diaria;
    
    @ManyToOne
    @JoinColumn (name="cliente")
    private Cliente cliente;

    public Veiculo() {
    }

    public Veiculo(String placa, String cidade, String modelo, int ano, BigDecimal valor_diaria, Cliente cliente) {
        this.placa = placa;
        this.cidade = cidade;
        this.modelo = modelo;
        this.ano = ano;
        this.valor_diaria = valor_diaria;
        this.cliente = cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(BigDecimal valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "codigo=" + codigo +
                ", placa=" + placa +
                ", cidade=" + cidade +
                ", modelo=" + modelo +
                ", ano=" + ano +
                ", valor_diaria=" + valor_diaria +
                ", cliente=" + cliente;
    }
    
}
