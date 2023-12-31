package br.com.casadocodigo.livraria.produtos;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ronaldo Gregorio
 * 
 * @version 1.0
 */

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    public GerenciadorDeCupons(){
        this.cupons = new HashMap<>();

        cupons.put("CUP74", 10.0);
        cupons.put("CUP158", 15.0);
        cupons.put("CUP14", 5.99);
        cupons.put("CUP52", 20.0);

    }

    public Double validaCupom(String cupom){
        return this.cupons.get(cupom);
    }
}
