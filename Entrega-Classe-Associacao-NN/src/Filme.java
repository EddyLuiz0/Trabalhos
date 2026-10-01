import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Atuacao> atuacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.atuacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        atuacoes.add(atuacao);
    }

    public void listarElenco() {
        System.out.println("Elenco de " + titulo + ":");
        for (Atuacao atuacao : atuacoes) {
            System.out.println("- " + atuacao.getAtor().getNome()
                    + " como " + atuacao.getPersonagem());
        }
    }
}
