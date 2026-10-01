import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
        criarComodosPadrao();
    }

    private void criarComodosPadrao() {
        comodos.add(new Comodo("Sala", 22.5));
        comodos.add(new Comodo("Cozinha", 14.0));
        comodos.add(new Comodo("Quarto", 16.0));
    }

    public void listarComodos() {
        System.out.println("Comodos da casa em " + endereco + ":");
        for (Comodo comodo : comodos) {
            System.out.printf("- %s: %.1f m2%n", comodo.getNome(), comodo.getAreaM2());
        }
    }
}
