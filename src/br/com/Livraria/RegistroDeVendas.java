package br.com.Livraria;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Teste-Driven Development");

        fisico.mostraDetalhes();

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Teste-Driven Development");

        ebook.mostraDetalhes();
    }
    
}
