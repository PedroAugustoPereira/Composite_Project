public class FuncionarioFolha extends UsuarioComponent{
    private String name;
    private String email;
    private String role;


    public FuncionarioFolha(String name, String email){
        this.name = name;
        this.email = email;
        this.setRole();
    }

    @Override
    protected void setRole() {
        this.role = "Funcionário";
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
}
