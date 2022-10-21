
package com.portfolio.LC.Service;

import com.portfolio.LC.Entity.Persona;
import com.portfolio.LC.Interface.IPersonaService;
import com.portfolio.LC.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> gerPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
        }
    @Override
    public void savePersona(Persona persona){
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id)  .orElse(null);
        return persona;
    }
}
