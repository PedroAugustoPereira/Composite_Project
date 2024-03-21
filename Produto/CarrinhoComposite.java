package Produto;
import java.util.ArrayList;

public class CarrinhoComposite extends ProdutoComponent{
    private ArrayList<ProdutoComponent> carrinho;

    public CarrinhoComposite(){
        carrinho = new ArrayList<ProdutoComponent>();
    }

    public void add(ProdutoComponent produto){
        carrinho.add(produto);
        return;
    }

    @Override
    public void remove(ProdutoComponent produto){
        int index = carrinho.indexOf(produto);
        carrinho.remove(index);
        return;
    }


    @Override
    public String getNome() {
        String nomes = "";
        for(int i = 0; i < carrinho.size() ; i++){
            nomes =  carrinho.get(i).getNome() + "\n";
        }
        
        return nomes;
    }

    @Override
    public Double getPrice() {
        Double price = 0.0;
        for(int i = 0; i < carrinho.size(); i++){
            price += carrinho.get(i).getPrice();
        }

        return price;
    }
    
}
