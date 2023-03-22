package mx.examen.dto;

//Clase que maneja los tipos de datos DTO
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {

    private long id;
    private String nombre;
    private String appellidoMaterno;
    private String appellidoPaterno;
    private String rfc;
    private String curp;
    private int edad;
    private String sexo;
    private String nacionalidad;
}
