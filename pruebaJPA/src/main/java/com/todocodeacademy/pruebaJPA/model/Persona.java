package com.todocodeacademy.pruebaJPA.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;
    private String nombre;
    private String apellido;
    private int edad;
    @OneToMany
    private List <Mascota> listaMascotas;
    
    public Persona(){
        
    };
    
    public Persona(long id, String nombre, String apellido, int edad, List<Mascota> listaMascotas) {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.listaMascotas=listaMascotas;
    }
    
    
}
