//public class Cliente extends FuncionarioAutenticavel {
public class Cliente implements IAutentica {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Autenticou!");
            return true;
        } else {
            System.out.println("Não autenticou!");
            return false;
        }
    }
}
