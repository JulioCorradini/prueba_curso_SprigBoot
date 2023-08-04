package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import java.util.List;

public interface IMascotaService {
    //Método para traer todas las mascotas
    //Lectura
    public List<Mascota> getMascotas();
    
    //Alta
    public void saveMascota(Mascota masco);
    
    //Baja
    public void deleteMascota(Long id_mascota);
    
    //Lectura de una sola mascota
    public Mascota findMascota(Long id_mascota);
    
    //Edición/Modificación
    public void editMascota(Long id_original, Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);
}
