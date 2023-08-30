public class Intranet {
//    public void login(FuncionarioAutenticavel fa) {
//        String senha = "123456";
//        fa.autentica(senha);
//    }

    public void login(IAutentica fa) {
        String senha = "123456";
        fa.autentica(senha);
    }
}
