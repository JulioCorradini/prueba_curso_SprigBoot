
package com.analisisdesentimiento.prueba;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Texto {
    private String texto;
    
    public Texto(){
        
    }
    
    public Texto(String texto){
        this.texto = texto;
    }
    
}
