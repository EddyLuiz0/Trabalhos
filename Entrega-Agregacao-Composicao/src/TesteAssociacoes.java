public class TesteAssociacoes {
    public static void main(String[] args) {
        Professor professor = new Professor("Mariana Costa", "Programacao Orientada a Objetos");
        Turma turma = new Turma("ADS 2A", professor);
        System.out.println("Turma: " + turma.getNome());
        System.out.println("Professor responsavel: " + turma.getProfessor().getNome());
        System.out.println();

        Jogador jogador1 = new Jogador("Lucas", 10);
        Jogador jogador2 = new Jogador("Rafael", 7);
        Jogador jogador3 = new Jogador("Bruno", 1);
        Time time = new Time("Estrelas FC");
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);
        time.listarJogadores();
        System.out.println();

        Casa casa = new Casa("Rua das Flores, 123");
        casa.listarComodos();
    }
}
