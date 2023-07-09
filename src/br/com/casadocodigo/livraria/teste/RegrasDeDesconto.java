package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.livraria.index.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegrasDeDesconto extends Livro{

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		if(!livro.aplicaDescontoDe(0.3)) {
			System.out.println("O desconto não pode ser maior que 30%");
		}else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("O desconto não pode ser maior que 15%");
		}else {
			System.out.println("O valor do Ebook com desconto é: " + ebook.getValor());
		}
			
	}

}
