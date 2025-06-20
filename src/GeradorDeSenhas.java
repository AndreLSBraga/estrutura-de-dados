import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GeradorDeSenhas {
    private Queue<Integer> filaSenhas;
    private List<Integer> historico;
    private int proximaSenha;

    public GeradorDeSenhas() {
        filaSenhas = new LinkedList<>();
        historico = new ArrayList<>();
        proximaSenha = 1;
    }

    public void gerarSenha() {
        filaSenhas.add(proximaSenha++);
        System.out.println("Senha gerada: " + (proximaSenha - 1));
    }

    public void chamarProximo() {
        if (!filaSenhas.isEmpty()) {
            int senha = filaSenhas.poll();
            historico.add(senha);
            System.out.println("Chamando senha: " + senha);
        } else {
            System.out.println("Nenhuma senha na fila.");
        }
    }

    public boolean filaVazia() {
        return filaSenhas.isEmpty();
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
