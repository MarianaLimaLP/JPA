package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name="locacao")
public class Locacao implements Serializable{
    
    @EmbeddedId
    private LocacaoPK locacaoPK;
    
    @ManyToOne
    @JoinColumn (name="cliente_id", nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="veiculo_id", nullable = false)
    private Veiculo veiculo;

    @Column(name = "data_locacao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataLocacao;
    
    @Column(name = "data_devolucao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDevolucao;

    @Column(name = "quantidade_dias", precision = 8, scale = 2)
    private int quantidade_dias;
    
    @Column(name = "valor_total", precision = 8, scale = 2)
    private BigDecimal valor_total;

    public Locacao() {
    }

    public Locacao(Cliente cliente, Veiculo veiculo, Date dataLocacao, Date dataDevolucao, BigDecimal valor_total, int qtd_dias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valor_total = valor_total;
        this.quantidade_dias = qtd_dias;
    }

    public LocacaoPK getLocacaoPK() {
        return locacaoPK;
    }

    public void setLocacaoPK(LocacaoPK locacaoPK) {
        this.locacaoPK = locacaoPK;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }

    public int getQuantidade_dias() {
        return quantidade_dias;
    }

    public void setQuantidade_dias(int quantidade_dias) {
        this.quantidade_dias = quantidade_dias;
    }

    @Override
    public String toString() {
        return "Locacao{" + "locacaoPK=" + locacaoPK + ", cliente=" + cliente + ", veiculo=" + veiculo + ", dataLocacao=" + dataLocacao + ", dataDevolucao=" + dataDevolucao + ", quantidade_dias=" + quantidade_dias + ", valor_total=" + valor_total + '}';
    }

    
    
    
}
