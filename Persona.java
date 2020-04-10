package ejercicio2;

public abstract class Persona {
	//atributos Persona
	private int dni;
	private String nombre;
	private String apellido;
	private String mail;
	private String direccion;
	
	//setters
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//getters
	public int getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getMail() {
		return mail;
	}
	public String getDireccion() {
		return direccion;
	}
	
	//constructor
	public Persona(int dni,String nombre,String apellido,String mail,String direccion) {
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
		setMail(mail);
		setDireccion(direccion);
	}
	
	//devuelve String con todos los datos de la persona
	public String toString() {
		String atributosPersona;
		atributosPersona = String.format("DNI: %d\nNOMBRE: %s\nAPELLIDO: %s\nMAIL: %s\nDIRECCION: %s\n",dni,nombre,apellido,mail,direccion);
		return atributosPersona;
	}
	
	
}
