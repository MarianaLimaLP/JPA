import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.modelo.Produto;
import java.math.BigDecimal;
import java.util.List;

public class Principal {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    public static void main(String[] args) {
        adicionarProdutos();
        exibirProdutos();
    }
    
    private static void adicionarProdutos(){
        for(int i=0;i<10;i++){
            Produto produto = new Produto("Produto "+(i+1), (i+1)*10, new BigDecimal((i+1)*100));
            produtoDAO.inserir(produto);
        }
        
    }
    
    private static void exibirProdutos(){
        List<Produto> produtos = produtoDAO.buscar();
        for(Produto p : produtos){
            System.out.println(p.getDescricao()+", "+p.getQuantidade()+" produtos, "+p.getPreco()+" reais.");
        }
        
    }
}
