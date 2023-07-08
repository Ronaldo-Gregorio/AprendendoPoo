package br.com.Livraria;

public class RegrasDeDesconto extends Livro{

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
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
