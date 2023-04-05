
package com.Proyecto.proyecto.repository;

import com.Proyecto.proyecto.entity.Dato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 */
@Repository
public interface DatoRepository extends CrudRepository<Dato, Long> {
    
}
