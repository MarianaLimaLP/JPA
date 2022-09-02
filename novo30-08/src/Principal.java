import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.dao.VendaDAO;
import br.edu.ifsp.pep.modelo.Item;
import br.edu.ifsp.pep.modelo.Produto;
import br.edu.ifsp.pep.modelo.Venda;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    private static VendaDAO vendaDAO = new VendaDAO();
    
    public static void main(String[] args) {
        adicionarProdutos();
        exibirProdutos();
        
        adicionarVendas();
        exibirVendas();
    }
    
    private static void adicionarProdutos(){
        for(int i=0;i<10;i++){
            Produto produto = new Produto("Produto "+(i+1), (i+1)*10, new BigDecimal((i+1)*100));
            produtoDAO.inserir(produto);
        }
        
    }
    
    private static void exibirProdutos(){
        List<Produto> produtos = produtoDAO.getTodos();
        for(Produto p : produtos){
            System.out.println(p.getDescricao()+", "+p.getQuantidade()+" produtos, "+p.getPreco()+" reais.");
        }
        
    }
    
    private static void adicionarVendas(){
        Venda venda = new Venda( new Date());
        List<Produto> produtos = produtoDAO.getTodos();
        
        Item item = new Item(venda, produtos.get(0), 10, produtos.get(0).getPreco());
        
        List<Item> itens = new ArrayList<>();
        itens.add(item);
        
        venda.setItens(itens);
        
        vendaDAO.inserir(venda);
        
        
    }
    
    private static void exibirVendas(){
        List<Venda> vendas = vendaDAO.getTodos();
        
        for(Venda v : vendas){
            System.out.println(v);
        }
        
    }
}
