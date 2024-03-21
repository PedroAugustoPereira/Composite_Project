import Produto.ProdutoComponent;
import Produto.ProdutoFolha;

public class Main {
    public static void main(String[] args) {
        ProdutoComponent produtoComponent = new ProdutoFolha("Detergente de louça",  4.99);
        UsuarioComponent clientes = new ClienteComposite();
        UsuarioComponent funcionarios = new FuncionarioComposite();

        GerenteFolha gerente = new GerenteFolha("Isadora", "isadora@gmail.com");
        
        funcionarios.add(gerente);

        
        UsuarioComponent cliente = new ClienteFolha("Pedro", "pedro@gmail.com");
        clientes.add(cliente);
        cliente.addProduto(produtoComponent);
    }
}
