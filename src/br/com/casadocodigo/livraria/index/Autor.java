package br.com.casadocodigo.livraria.index;

public class Autor {
	
	private String nome;
	private String email;
	private String cpf;
	
	// inicio metodos
	
	public void mostraDetalhes() {
		System.out.println("Mostrando detalhes do autor ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}
	
	// fim metodos
	
	// inicio getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// fim getters e setters
	
	
}
