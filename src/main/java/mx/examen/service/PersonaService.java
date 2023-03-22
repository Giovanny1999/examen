//Interface para firmar metodos de implementacion
package mx.examen.service;

import mx.examen.dto.PersonaDTO;

import java.util.List;

public interface PersonaService {
    List<PersonaDTO> getPersonas();

   List< PersonaDTO> obtenerInformacionLista(long id);





}
