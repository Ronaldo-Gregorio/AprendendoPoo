package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.index.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Teste-Driven Development");
        fisico.setValor(59.90);

        if(fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Teste-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total : " + carrinho.getTotal());

        Produto[] produtos = carrinho.getProdutos();

        for(Produto produto : produtos){

            try{
                
                if(produto != null){
                    System.out.println(produto.getValor());
                }
            }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
                System.out.println("Foi uma das duas");
            }
        }
    }
}
