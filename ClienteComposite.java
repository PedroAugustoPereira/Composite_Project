import java.util.ArrayList;

import Produto.ProdutoComponent;


public class ClienteComposite extends UsuarioComponent{
    private ArrayList<UsuarioComponent> clientes = new ArrayList<UsuarioComponent>();
    
    @Override
    public void add(UsuarioComponent usuario) {
        clientes.add(usuario);
        return;
    }

    @Override
    public void remove(UsuarioComponent usuario) {
        int index = clientes.indexOf(usuario);
        clientes.remove(index);
        return;
    }

    @Override
    protected void setRole() {
        throw new UnsupportedOperationException("Unimplemented method 'setRole'");
    }

    @Override
    public String getRole() {
        return "Cliente";
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    @Override
    public String getName() {
        String names = "";
        for(int i = 0 ; i < this.clientes.size() ; i++){
            names += this.clientes.get(i).getName() + "\n";
        }   

        return names;
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

    @Override
    public String getEmail() {
        String emails = "";
        for(int i = 0 ; i < this.clientes.size() ; i++){
            emails += this.clientes.get(i).getEmail() + "\n";
        }   

        return emails;
    }

}
