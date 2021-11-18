package dad.gsonsample;

public class Persona {

	private String nombre;
	private String apellidos;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String Apellidos) {
		this.apellidos = Apellidos;
	}
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return " nombre = " + nombre + "; apellido = " + apellidos + "; edad = " + edad;
	}
}
