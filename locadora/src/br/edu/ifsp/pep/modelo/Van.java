package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "van")
@DiscriminatorValue(value = "VAN")
public class Van extends Veiculo{
    
    public void setValor_diaria() {
        setValor_diaria(new BigDecimal(100)); // valor da diaria fixo;
    }

    public Van() {
    }

    public Van(String placa, String cidade, String modelo, int ano, Cliente cliente) {
        super(placa, cidade, modelo, ano, new BigDecimal(100), cliente); //quando criar o valor da diaria é fixo;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tipo: Van.}";
    }
    
}
