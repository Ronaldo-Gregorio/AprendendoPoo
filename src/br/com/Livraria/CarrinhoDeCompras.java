package br.com.Livraria;

public class CarrinhoDeCompras extends Livro{

    private double total;

    public void adiciona(Produto produto){

        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }
}
