public class UsuarioFolha extends UsuarioComponent {
    private String name;
    private String email;
    private String role;

    @Override
    protected void setRole() {
        this.role = "Usuário";
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public String getName() {
       return this.name;
    }
    @Override
    public void setEmail(String email) {
       this.email = email;
    }
    @Override
    public String getEmail() {
       return this.email;
    }
}
