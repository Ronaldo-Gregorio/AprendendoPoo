package br.com.Livraria;

public class CarrinhoDeCompras extends Livro{

    private double total;

    public void adiciona(Livro livro){

        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.16);
        total += livro.getValor();
    }

    public double getTotal(){
        return total;
    }
}
