package br.com.casadocodigo.livraria.produtos;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeCupons {
    private Set<String> cupons;

    public GerenciadorDeCupons(){
        this.cupons = new HashSet<String>();

        cupons.addAll(Arrays.asList("CUP74", "CUP158", "CUP14", "CUP52", "CUP21", "CUP221", "CUP91", "CUP327", "CUP410", "CUP275", "CUP 484", "CUP207", "CUP96", "CUP119", "CUP174", "CUP291", "CUP1", "CUP115", "CUP222", "CUP272"));
    }

    public boolean validaCupom(String cupom){
        return this.cupons.contains(cupom);
    }
}
