
package com.francisco.demo.Interface;

import com.francisco.demo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // traer a una lista de personas
    public List<Persona> getPersona();

    // guardar un objeto persona
    public void savePersona(Persona persona);
    
    
    // eliminar un objeto persona (usuario), por ID
    public void deletePersona(Long id);
    
    // buscar un objeto persona (por Id)
    public Persona findPersona(Long id);

}