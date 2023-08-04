package com.analisisdesentimiento.prueba;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Analisis {
    private String txtoAnalisis;
    
    public Analisis (){
    
    }
    
    public Analisis(String textoAnalisis) {
        this.txtoAnalisis = textoAnalisis;
    }
}
