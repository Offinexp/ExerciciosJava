package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.titulo);
            System.out.println(livro.autor);
            System.out.println(livro.anoPublicacao);
            System.out.println();
        }
    }
}
