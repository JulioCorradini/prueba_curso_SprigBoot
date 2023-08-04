
package com.analisisdesentimiento.prueba.controller;

import com.analisisdesentimiento.prueba.Analisis;
import com.analisisdesentimiento.prueba.Texto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    private String textoGuardado;
    private String analisisGuardado;
    
    @PostMapping ("/texto")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void crearTexto(@RequestBody Texto txt) {
    System.out.println (txt.getTexto());
    textoGuardado = txt.getTexto();
    }
    
    @GetMapping ("/respuesta")
    @ResponseBody
    public String enviarRespuesta(){
        return textoGuardado;
    }
    
    @PostMapping ("/analisisPOST")
    @CrossOrigin (origins = "*", allowedHeaders = "*")
    public void crearAnalisis (@RequestBody Analisis ans) {
        System.out.println (ans.getTxtoAnalisis());
        analisisGuardado = ans.getTxtoAnalisis();
    }
    
    @GetMapping ("/analisisGET")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @ResponseBody
    public String eviarAnalisis(){
        return analisisGuardado;
    }
    


}
