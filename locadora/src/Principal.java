
import br.edu.ifsp.pep.dao.CarroDAO;
import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.LocacaoDAO;
import br.edu.ifsp.pep.dao.MotoDAO;
import br.edu.ifsp.pep.dao.VanDAO;
import br.edu.ifsp.pep.dao.VeiculoDAO;
import br.edu.ifsp.pep.modelo.Carro;
import br.edu.ifsp.pep.modelo.Moto;
import br.edu.ifsp.pep.modelo.Van;
import br.edu.ifsp.pep.modelo.Veiculo;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.Locacao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
    private static VeiculoDAO veiculoDAO = new VeiculoDAO();
    private static CarroDAO carroDAO = new CarroDAO();
    private static MotoDAO motoDAO = new MotoDAO();
    private static VanDAO vanDAO = new VanDAO();
    private static LocacaoDAO locacaoDAO = new LocacaoDAO();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    
    public static void main(String[] args) {
        inserirVeiculos();
        inserirCliente();
        
        fazerLocacao();
        mostrarDisponiveis();
        
    }
    
    public static void inserirVeiculos(){
        Veiculo c1 = new Carro("ABC-1234", "Presidente Epitácio", "ONIX LT 1.0", 2015, null);
        verificarParaInserir(c1);
        Veiculo c2 = new Carro("ABC-1234", "Presidente Prudente", "GOL 1.4", 2004, null);
        verificarParaInserir(c2);
        Veiculo m1 = new Moto("CBA-4321", "Presidente Epitácio", "moto tal", 2018, null);
        verificarParaInserir(m1);
        Veiculo m2 = new Moto("ABC-4321", "Presidente Prudente", "moto seiquela", 2010, null);
        verificarParaInserir(m2);
        Veiculo v1 = new Van("DEF-5678", "Presidente Prudente", "vanzona", 2010, null);
        verificarParaInserir(v1);
        Veiculo v2 = new Van("FED-8765", "Presidente Venceslau", "vanzinha", 2010, null);
        verificarParaInserir(v2);
    }
    
    public static void fazerLocacao(){
        Cliente c = clienteDAO.getTodos().get(2);
        Veiculo v = veiculoDAO.getTodos().get(4);
        int qtd = 0;
        if(v instanceof Carro){
            qtd = 50;
        }
        if(v instanceof Moto){
            qtd =  40;
        }
        if(v instanceof Van){
            qtd =  100;
        }
        
        Locacao l1 = new Locacao(c, v, new Date(), null, null, 5);
        v.setCliente(c);
        veiculoDAO.alterar(v);
        l1.setValor_total(new BigDecimal(l1.getQuantidade_dias() * qtd));
        
        c = clienteDAO.getTodos().get(2);
        v = veiculoDAO.getTodos().get(1);
        Locacao l2 = new Locacao(c, v, new Date(), null, null, 3);
        v.setCliente(c);
        veiculoDAO.alterar(v);
        l2.setValor_total(new BigDecimal(l2.getQuantidade_dias() * qtd));
        
        c = clienteDAO.getTodos().get(6);
        v = veiculoDAO.getTodos().get(5);
        Locacao l3 = new Locacao(c, v, new Date(), null, null, 2);
        v.setCliente(c);
        veiculoDAO.alterar(v);
        l3.setValor_total(new BigDecimal(l3.getQuantidade_dias() * qtd));
        
        c = clienteDAO.getTodos().get(3);
        v = veiculoDAO.getTodos().get(3);
        Locacao l4 = new Locacao(c, v, new Date(), null, null, 6);
        v.setCliente(c);
        veiculoDAO.alterar(v);
        l4.setValor_total(new BigDecimal(l4.getQuantidade_dias() * qtd));
        
        c = clienteDAO.getTodos().get(8);
        v = veiculoDAO.getTodos().get(2);
        Locacao l5 = new Locacao(c, v, new Date(), null, null, 8);
        v.setCliente(c);
        veiculoDAO.alterar(v);
        l5.setValor_total(new BigDecimal(l5.getQuantidade_dias() * qtd));
        System.out.println("Valor a ser pago: "+l1.getValor_total());
        System.out.println("Valor a ser pago: "+l2.getValor_total());
        System.out.println("Valor a ser pago: "+l3.getValor_total());
        System.out.println("Valor a ser pago: "+l4.getValor_total());
        System.out.println("Valor a ser pago: "+l5.getValor_total());
        locacaoDAO.inserir(l1);
        locacaoDAO.inserir(l2);
        locacaoDAO.inserir(l3);
        locacaoDAO.inserir(l4);
        locacaoDAO.inserir(l5);
        
    }
    
    public static void inserirCliente(){
        for(int i=0;i<10;i++){
            Cliente c = new Cliente("Cliente "+i, "1899999999"+i);
            clienteDAO.inserir(c);
        }
    }
    
    public static void verificarParaInserir(Veiculo v){
        List<Veiculo> veiculos = veiculoDAO.getTodos();
        Boolean jaExiste = false;
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getPlaca().equals(v.getPlaca())&&veiculo.getCidade().equals(v.getCidade())){
                jaExiste = true; //ja existe um igual, na pode inserir
            }
        }
        if(!jaExiste)
            veiculoDAO.inserir(v);
    }
    
    public static void mostrarTodos(){
        List<Veiculo> veiculos = veiculoDAO.getTodos();
        
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }
    
    public static void mostrarDisponiveis(){
        List<Veiculo> veiculos = veiculoDAO.getDisponiveisParaAlocacao();
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }
    
}
