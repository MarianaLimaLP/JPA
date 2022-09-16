package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
@DiscriminatorValue(value = "MOTO")
public class Moto extends Veiculo{
   
    public void setValor_diaria() {
        setValor_diaria(new BigDecimal(40)); // valor da diaria fixo;
    }

    public Moto() {
    }

    public Moto(String placa, String cidade, String modelo, int ano, Cliente cliente) {
        super(placa, cidade, modelo, ano, new BigDecimal(40), cliente); //quando criar o valor da diaria é fixo;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo: Moto.}";
    }
    
}
