package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
		double soma = 0;
		
		for(int i = 0; i < 35; i++) {
			if(i == 7) {
				continue;
			}
			soma += 59.90;
		}
		
		System.out.println("O total em estoque é " + soma + "\n");
		
		if(soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		}else if (soma >= 2000){
			System.out.println("Seu estoque está muito alto!");
		}else {
			System.out.println("Seu estoque está bom");
		}
		
	}

}
