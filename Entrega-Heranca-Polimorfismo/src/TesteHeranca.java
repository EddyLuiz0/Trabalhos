import java.util.ArrayList;

public class TesteHeranca {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", 2024, 4));
        veiculos.add(new Moto("Honda", 2023, 160));

        System.out.println("Veiculos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3.0));
        formas.add(new Retangulo(4.0, 5.0));

        double somaAreas = 0;
        for (Forma forma : formas) {
            somaAreas += forma.calcularArea();
        }

        System.out.printf("%nSoma total das areas: %.2f%n", somaAreas);
    }
}
