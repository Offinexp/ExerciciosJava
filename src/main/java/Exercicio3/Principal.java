package Exercicio3;

public class Principal {
    public static void main(String[] args) {
        //Colocando os produtos
        Produto produto1 = new Produto("Roupa PetLove - Gatao", 67.00, 3);
        Produto produto2 = new Produto("Brinquedo - Catnip com bolinha", 150.00, 4);
        Produto produto3 = new Produto("Caminha Aquecida", 800.00, 2);

        // Colocando o carrinho de compras
        CarrinhoCompra  carrinho = new CarrinhoCompra ();

        // Adicionando os produtos dentro do carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Pedindo para listar os produtos no carrinho
        carrinho.listarProdutos();

        // Print do valor
        System.out.printf("Total: R$ %.2f%n", carrinho.calcularTotal());
    }
}