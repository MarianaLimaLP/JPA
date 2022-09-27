package principal;

/**
 *
 * @author aluno
 */
public class Principal {
    
    private static VeiculoDAO veiculoDAO = new VeiculoDAO();
    private static TipoVeiculoDAO tipoveiculo = new TipoVeiculoDAO();
    
    public static void main(String[] args) {
    }
    
    TipoVeiculo tipoCarro = new TipoVeiculo("ABC-1234", "P. Epitácio", "Gol 1.0", 2010, tipoCarro);
    
}
