import Produto.CarrinhoComposite;
import Produto.ProdutoComponent;

public class ClienteFolha extends UsuarioComponent{
    private String email;
    private String name;
    private String role;
    private ProdutoComponent carrinho;

    public ClienteFolha(String name, String email){
        this.name = name;
        this.email = email;
        this.setRole();
        carrinho = new CarrinhoComposite();
    }

    @Override
    public void addProduto(ProdutoComponent produto) {
        carrinho.add(produto);
    }

    @Override
    public void removeProduto(ProdutoComponent produto) {
        carrinho.remove(produto);
    }

    
    @Override
    protected void setRole() {
        this.role = "Cliente";
    }

    
    @Override
    public String getRole(){
        return this.role;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
