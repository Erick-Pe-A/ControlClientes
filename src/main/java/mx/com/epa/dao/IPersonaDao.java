package mx.com.epa.dao;

import mx.com.epa.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Long>{
    
}
