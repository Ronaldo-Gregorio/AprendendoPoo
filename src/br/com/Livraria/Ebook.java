package br.com.Livraria;

public class Ebook extends Livro{
	
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
		return super.aplicaDescontoDe(porcentagem);
	}
	
	//setter e getters

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}