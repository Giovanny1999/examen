//Clase que accede al repositorio de JPA
package mx.examen.repository;
import mx.examen.entity.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {


}
