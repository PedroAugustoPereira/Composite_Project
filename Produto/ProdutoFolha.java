package Produto;
public class ProdutoFolha extends ProdutoComponent {
    public String name;
    public Double price;

    public ProdutoFolha(String name, Double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getNome() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
