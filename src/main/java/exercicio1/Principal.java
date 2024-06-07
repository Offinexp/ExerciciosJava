package exercicio1;

public class Principal {
    public static void main(String[] args) {

        // Aqui eu crio objetos da classe Livro

        Livro l1 = new Livro();
        l1.titulo = "A Branca de Neve";
        l1.autor = "Jacob Ludwig Carl Grimm, Wilhelm Grimm";
        l1.anoPublicacao = 1812 ;

        Livro l2 = new Livro();
        l2.titulo = "Memórias Postumas de Brás Cubas";
        l2.autor = "Machado de Assis";
        l2.anoPublicacao = 1881;

        Livro l3 = new Livro();
        l3.titulo = "Os capitães de Areia";
        l3.autor = "Jorge Amado";
        l3.anoPublicacao = 1937;

        Biblioteca b1 = new Biblioteca();
        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);
        b1.adicionarLivro(l3);

        System.out.println("Os livros cadastrados na Biblioteca:");
        b1.listarLivros();
    }
}