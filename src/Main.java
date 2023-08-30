public class Main {
    public static void main(String[] args) {
        Intranet intra = new Intranet();

        Diretor diretor = new Diretor();
        diretor.setSenha("123456");

        intra.login(diretor);

        Gerente gerente = new Gerente();
        gerente.setSenha("123456");
        gerente.setSetor("LICITACOES");

        intra.login(gerente);

        Gerente gerente2 = new Gerente();
        gerente2.setSenha("12345");
        gerente2.setSetor("LICITACOES");

        intra.login(gerente2);

        Diretor diretor2 = new Diretor();
        diretor2.setSenha("1234");

        intra.login(diretor2);

        Cliente cliente = new Cliente();
        cliente.setSenha("123456");

        intra.login(cliente);
    }
}
