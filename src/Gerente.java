//public class Gerente extends FuncionarioAutenticavel {
public class Gerente extends Funcionario implements IAutentica {
    private String setor;

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean autentica(String senha) {
        if (getSenha().equals(senha) && setor.equals("LICITACOES")) {
            System.out.println("Autenticou!");
            return true;
        } else {
            System.out.println("Não autenticou!");
            return false;
        }
    }
}
