//Clase controlador para asignar rutas de cada tipo
package mx.examen.controller;

import mx.examen.dto.PersonaDTO;
import mx.examen.service.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API")
public class PersonaController {
    //Inyecccion de dependencia service IMPl
    @Autowired
    private PersonaServiceImpl servicioPersona;

    //Metodo get para obtener todos los registros
    @GetMapping(value="/getPersona")
    public List<PersonaDTO> getPersonas(){
        return servicioPersona.getPersonas();
    }

    //Metodo de prueba de aplicacion
    @GetMapping(value="/getMensaje")
    public String get(){
        return "Prueba Api";
    }

    //Metodo que obtiene la infromacion de una sola persona
    @GetMapping(value="/getInformation")
    public List<PersonaDTO> getInformation2(@RequestParam(required = false, value = "") Integer id) {
        if(id == null){
            return servicioPersona.getPersonas();
        }else {
            return servicioPersona.obtenerInformacionLista(id);
        }

    }


}
