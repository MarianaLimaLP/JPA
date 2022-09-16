package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
@DiscriminatorValue(value = "CARRO")
public class Carro extends Veiculo{
    
    public void setValor_diaria() {
        setValor_diaria(new BigDecimal(50)); // valor da diaria fixo;
    }

    public Carro() {
    }

    public Carro(String placa, String cidade, String modelo, int ano, Cliente cliente) {
        super(placa, cidade, modelo, ano, new BigDecimal(50), null); //quando criar o valor da diaria é fixo;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tipo: Carro.}";
    }
    
}
