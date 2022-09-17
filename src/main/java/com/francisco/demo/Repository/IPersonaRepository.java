

package com.francisco.demo.Repository;

import com.francisco.demo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //aclaramos que es un repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
