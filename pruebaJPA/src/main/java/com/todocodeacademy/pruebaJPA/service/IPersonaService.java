package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Metodos para traer a todas las personas
    //lectura
    public List<Persona> getPersonas();
    
    //alta
    public void savePersona(Persona perso);
    
    //baja
    public void deletePersona (Long id);
    
    //lectura de un solo objeto
    public Persona findPersona(Long id);
    
    //edicion/modificacion
    public void editPersona (long idOriginal, long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);
    
    //edición/modificación con el objeto pasado como parámetro (solo se puede usar cuando la ID es inmutable)
    public void editPersona (Persona per);
}
