package bomberApp.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad Persona
 * 
 * @author Héctor Liceaga: hr.liceaga@gmail.com	
 * @version 1.0
 * @since 04/01/2023
 * 
 */
@Getter
@Setter
@Entity
@Data
@Table(name = "personas")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombres;
	@Column	
	private String apellidos;
	@Column
	private int dni;
	@Column
	private Date fecha_nac;
	
	/**
	 * Constructor con todos los atributos
	 * @param id
	 * @param nombres
	 * @param apellidos
	 * @param dni
	 * @param fecha_nac
	 */
	public Persona(String nombres, String apellidos, int dni, Date fecha_nac) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
	}

	/**
	 * @param nombres
	 * @param apellidos
	 * @param dni
	 */
	public Persona(String nombres, String apellidos, int dni) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * Constructor vacío
	 */
	public Persona() {
		super();
	}
	
	
	
}
