package br.edu.ifsp.pep.modelo;

import javax.swing.JOptionPane;

public class Mensagem {
    public static void sucesso(String texto){
        JOptionPane.showMessageDialog(null, texto, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void erro(String texto){
        JOptionPane.showMessageDialog(null, texto, "Erro!", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void atencao(String texto){
        JOptionPane.showMessageDialog(null, texto, "Atenção!", JOptionPane.ERROR_MESSAGE);
    }
    
}
