package br.com.Livraria;

public interface Promocional {
    
    public boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10Porcento(){
        return aplicaDescontoDe(0.1);
    }
}
