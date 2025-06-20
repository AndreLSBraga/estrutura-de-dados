import java.util.Stack;

public class Navegador {
    private Stack<String> voltar;
    private Stack<String> avancar;
    private String paginaAtual;

    public Navegador() {
        voltar = new Stack<>();
        avancar = new Stack<>();
        paginaAtual = null;
    }

    public void acessarPagina(String url) {
        if (paginaAtual != null) {
            voltar.push(paginaAtual);
        }
        paginaAtual = url;
        avancar.clear(); // ao acessar uma nova página, a pilha de avanço é descartada
        printStatus("Acessando nova página");
    }

    public void voltar() {
        if (!voltar.isEmpty()) {
            avancar.push(paginaAtual);
            paginaAtual = voltar.pop();
        }
        printStatus("Voltar");
    }

    public void avancar() {
        if (!avancar.isEmpty()) {
            voltar.push(paginaAtual);
            paginaAtual = avancar.pop();
        }
        printStatus("Avançar");
    }

    public boolean podeVoltar() {
        return !voltar.isEmpty();
    }

    public boolean podeAvancar() {
        return !avancar.isEmpty();
    }

    private void printStatus(String acao) {
        System.out.println("\n--- " + acao + " ---");
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Pode voltar? " + podeVoltar());
        System.out.println("Pode avançar? " + podeAvancar());
    }
}
