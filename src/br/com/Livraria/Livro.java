package br.com.Livraria;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	// inicio metodos
	
	void mostraDetalhes() {
		
		String mensagem = "Mostrando detalhes do livro";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		if(temAutor()) {
			autor.mostraDetalhes();
		}
		
		System.out.println("--");
		
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		this.valor -= this.valor * porcentagem;
		return true;
		
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	// fim metodos
	
	// inicio dos construtores
	
	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	public Livro() {
		
	}
	
	// fim dos construtores
	
	// inicio getters e setters
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	// fim getters e setters
	
}
