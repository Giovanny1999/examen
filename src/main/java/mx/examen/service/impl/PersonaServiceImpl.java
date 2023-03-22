//Clase de implementacion con toda la logica
package mx.examen.service.impl;

import mx.examen.dto.PersonaDTO;
import mx.examen.entity.PersonaEntity;
import mx.examen.repository.PersonaRepository;
import mx.examen.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private static final Logger log = LoggerFactory.getLogger(PersonaServiceImpl.class);

    //Inyeccion de dependencia del repository
    @Autowired
   PersonaRepository repositoryPersona;

    //Logica del metodo getPersonas()
    @Override
    public List<PersonaDTO> getPersonas() {
        List<PersonaEntity> lstPersonas = repositoryPersona.findAll();
        List<PersonaDTO> lstReturn = new ArrayList<PersonaDTO>();
        PersonaDTO aux;
        for(PersonaEntity city: lstPersonas) {
            aux = new PersonaDTO();
            aux.setId(city.getId());
            aux.setNombre(city.getNombre());
            aux.setAppellidoMaterno(city.getAppellidoMaterno());
            aux.setAppellidoPaterno(city.getAppellidoPaterno());
            aux.setEdad(city.getEdad());
            aux.setCurp(city.getCurp());
            aux.setRfc(city.getRfc());
            aux.setSexo(city.getSexo());
            aux.setNacionalidad(city.getNacionalidad());
            lstReturn.add(aux);
        }
        return lstReturn;
    }

    //Logica del metodo obtenerLista: Sirve para obtener un solo registro
    @Override
    public List<PersonaDTO> obtenerInformacionLista(long id) {

        Optional<PersonaEntity> registro = repositoryPersona.findById(id);
        PersonaDTO retorno = new PersonaDTO();
        List<PersonaDTO> lstReturn = new ArrayList<PersonaDTO>();
        PersonaDTO aux;
        if(id == 0){
            return getPersonas();
        }
        if(!registro.isPresent()){
            return getPersonas();
        }
        retorno = new PersonaDTO();
        retorno.setId(registro.get().getId());
        retorno.setNombre(registro.get().getNombre());
        retorno.setAppellidoMaterno(registro.get().getAppellidoMaterno());
        retorno.setAppellidoPaterno(registro.get().getAppellidoPaterno());
        retorno.setEdad(registro.get().getEdad());
        retorno.setCurp(registro.get().getCurp());
        retorno.setRfc(registro.get().getRfc());
        retorno.setSexo(registro.get().getSexo());
        retorno.setNacionalidad(registro.get().getNacionalidad());
        lstReturn.add(retorno);
        return lstReturn;
    }

}
