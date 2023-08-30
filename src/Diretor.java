//public class Diretor extends FuncionarioAutenticavel {
public class Diretor extends Funcionario implements IAutentica {
    public boolean autentica(String senha) {
        if (getSenha().equals(senha)) {
            System.out.println("Autenticou!");
            return true;
        } else {
            System.out.println("Não autenticou!");
            return false;
        }
    }
}
