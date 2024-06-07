package Exercicio3;

import java.util.ArrayList;

public class CarrinhoCompra {
    private ArrayList<Produto> produtos;

    public CarrinhoCompra () {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("Nome Valor Unit Qtd Sub-total");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubTotal();
        }
        return total;
    }
}