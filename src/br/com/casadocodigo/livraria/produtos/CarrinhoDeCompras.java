package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras extends Livro{

    private double total;
    private Produto[] produtos;
    private int contador = 0;

    public CarrinhoDeCompras(Produto[] produtos){
        this.produtos = produtos;
    }

    public void remove(int posicao){
        this.produtos[posicao] = null;
    }

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
