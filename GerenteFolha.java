public class GerenteFolha extends UsuarioComponent{
    private String name;
    private String email;
    private String role;

    public GerenteFolha(String name, String email){
        this.name = name;
        this.email = email;
        setRole();
    }

    @Override
    protected void setRole() {
        this.role = "Gerente";
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

    
    public UsuarioComponent newCliente(UsuarioComponent usuarioComposite, String name, String email) {
        UsuarioComponent client = new ClienteFolha(name, email);
        usuarioComposite.add(client);

        return client;
    }

    
    public boolean removeCliente(UsuarioComponent usuarioComposite , ClienteComposite usuario) {
        usuarioComposite.remove(usuario);
        return true;
    }

    public void createFuncionario(UsuarioComponent usuarioComponent){
        if(role == "Gerente"){
            super.add(usuarioComponent);
        }
    }

    public void removeFuncionario(UsuarioComponent usuario){
        if(role == "Gerente"){
            super.remove(usuario);
        }
    }
}
