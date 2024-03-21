package Produto;

public abstract class ProdutoComponent {
    public abstract String getNome();
    public abstract Double getPrice();
    public void add(ProdutoComponent produto){}
    public void remove(ProdutoComponent produto){}
}
