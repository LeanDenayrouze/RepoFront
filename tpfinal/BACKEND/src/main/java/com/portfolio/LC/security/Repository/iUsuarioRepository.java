package com.portfolio.LC.security.Repository;

import com.portfolio.LC.security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUusuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);  
    boolean existsByEmail(String email);
}
