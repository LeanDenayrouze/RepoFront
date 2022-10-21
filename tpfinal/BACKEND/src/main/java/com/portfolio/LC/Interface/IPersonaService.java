 
package com.portfolio.LC.Interface;

import com.portfolio.LC.Entity.Persona;
import java.util.List;

 
public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> gerPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un objeto buscado por la ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
