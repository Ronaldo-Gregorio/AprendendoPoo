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
		double desconto = super.getValor() * porcentagem;
		super.setValor(super.getValor() - desconto);
		return true;
	}
	
	//setter e getters

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
