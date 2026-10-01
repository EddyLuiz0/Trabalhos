public class TesteAssociacaoNN {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java para Iniciantes");
        Livro livro2 = new Livro("Modelagem Orientada a Objetos");
        Autor autor1 = new Autor("Ana Silva");
        Autor autor2 = new Autor("Carlos Souza");

        Autoria.autorar(livro1, autor1, "autor principal");
        Autoria.autorar(livro1, autor2, "coautor");
        Autoria.autorar(livro2, autor2, "autor principal");

        livro1.listarAutores();
        System.out.println();
        livro2.listarAutores();
        System.out.println();

        Ator ator1 = new Ator("Fernanda Lima");
        Ator ator2 = new Ator("Paulo Rocha");
        Filme filme1 = new Filme("A Cidade Perdida");
        Filme filme2 = new Filme("Ultima Missao");

        Atuacao.atuar(ator1, filme1, "Helena");
        Atuacao.atuar(ator2, filme1, "Miguel");
        Atuacao.atuar(ator1, filme2, "Capita Laura");

        filme1.listarElenco();
        System.out.println();
        filme2.listarElenco();
    }
}
