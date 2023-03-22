//Clase que maneja el modelo de los datos a la base de datos
package mx.examen.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PERSONA")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaEntity {
    //Indica el id
    @Id
    //Genera una sequencia para autoincrementar el id
    @SequenceGenerator(name = "sequCity", sequenceName = "CITY_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sequCity")
    private long id;

    //Indica que columna es
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    //Indica que columna es
    @Column(name = "APELLIDOM", nullable = false)
    private String appellidoMaterno;
    //Indica que columna es
    @Column(name = "APELLIDOP", nullable = false)
    private String appellidoPaterno;
    //Indica que columna es
    @Column(name = "RFC", nullable = false)
    private String rfc;
    //Indica que columna es
    @Column(name = "CURP", nullable = false)
    private String curp;
    //Indica que columna es
    @Column(name = "EDAD", nullable = false)
    private int edad;
    //Indica que columna es
    @Column(name = "SEXO", nullable = false)
    private String sexo;
    //Indica que columna es
    @Column(name = "NACIONALIDAD", nullable = false)
    private String nacionalidad;
}
