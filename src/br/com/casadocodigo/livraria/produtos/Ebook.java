package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.index.Autor;

public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto no Ebook");
		return aplicaDescontoDe(porcentagem);
	}
	
	//setter e getters

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
