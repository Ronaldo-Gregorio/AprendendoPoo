package br.com.casadocodigo.livraria.produtos;
import java.util.ArrayList;

public class CarrinhoDeCompras extends Livro{

    private double total;
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(Produto[] produtos){
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto){

        this.total += produto.getValor();
        this.produtos.add(produto);
    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public double getTotal(){
        return total;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
}
