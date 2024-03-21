import Produto.ProdutoComponent;

public abstract class UsuarioComponent{
    public void add(UsuarioComponent usuario){}
    public void remove(UsuarioComponent usuario){}
    public void addProduto(ProdutoComponent produto) {}
    public void removeProduto(ProdutoComponent produto) {}
    
    protected abstract void setRole();
    public abstract String getRole();
    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setEmail(String email);
    public abstract String getEmail();
}