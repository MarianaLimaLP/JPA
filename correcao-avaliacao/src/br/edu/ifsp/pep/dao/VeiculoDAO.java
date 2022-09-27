/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Veiculo;
import java.util.List;

/**
 *
 * @author aluno
 */
public class VeiculoDAO extends AbstractDAO<Veiculo>{
    public List<Veiculo> buscarTodos() {
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarTodos", Veiculo.class)
                .getResultList();
    }
    
    public Veiculo buscarPorCidadeEPlaca(String cidade, String placa){
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarTodos", Veiculo.class)
                .getSingleResult();
    }
}
