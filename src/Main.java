public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULANDO NAVEGADOR ===");
        Navegador nav = new Navegador();
        nav.acessarPagina("google.com");
        nav.acessarPagina("mozilla.org");
        nav.acessarPagina("openai.com");
        nav.voltar();
        nav.voltar();
        nav.avancar();
        nav.acessarPagina("github.com");

        System.out.println("\n=== GERADOR DE SENHAS ===");
        GeradorDeSenhas gerador = new GeradorDeSenhas();

        gerador.gerarSenha();
        gerador.gerarSenha();
        gerador.gerarSenha();

        gerador.chamarProximo();
        gerador.chamarProximo();
        gerador.chamarProximo();
        gerador.chamarProximo(); // sem senha

        System.out.println("Histórico de atendimentos: " + gerador.getHistorico());
    }
}
