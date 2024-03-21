import java.util.ArrayList;

public class FuncionarioComposite extends UsuarioComponent{
    private ArrayList<UsuarioComponent> funcionarios = new ArrayList<UsuarioComponent>();

    @Override
    public void add(UsuarioComponent usuario) {
        funcionarios.add(usuario);
        return;
    }

    @Override
    public void remove(UsuarioComponent usuario) {
        int index = funcionarios.indexOf(usuario);
        funcionarios.remove(index);
        return;
    }

    @Override
    protected void setRole() {
        throw new UnsupportedOperationException("Unimplemented method 'setRole'");
    }

    @Override
    public String getRole() {
        throw new UnsupportedOperationException("Unimplemented method 'getRole'");
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    @Override
    public String getName() {
        String names = "";
        for (int i = 0; i < this.funcionarios.size(); i++) {
            names += this.funcionarios.get(i).getName() + "\n";
        }

        return names;
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

    @Override
    public String getEmail() {
        String email = "";
        for (int i = 0; i < this.funcionarios.size(); i++) {
            email += this.funcionarios.get(i).getEmail() + "\n";
        }

        return email;
    }

}
