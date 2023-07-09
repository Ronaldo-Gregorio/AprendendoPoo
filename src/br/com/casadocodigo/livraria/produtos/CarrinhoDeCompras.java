package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras extends Livro{

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto){

        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }

    public Produto[] getProdutos() {
        return produtos;
    }
    
}
