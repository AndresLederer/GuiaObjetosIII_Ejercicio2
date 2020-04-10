package ejercicio2;

public class Estudiante extends Persona {
	//atributos Estudiante
	private int anioIngreso;
	private String carrera;
	private boolean cuotaMensual;
	
	//setters
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setCuotaMensual(boolean cuoataMensual) {
		this.cuotaMensual = cuoataMensual;
	}
	
	//getters
	public int getAnioIngreso() {
		return anioIngreso;
	}
	public String getCarrera() {
		return carrera;
	}
	public boolean getCuotaMensual() {
		return cuotaMensual;
	}
	
	//constructor
	public Estudiante(int dni,String nombre,String apellido,String mail,String direccion,int anioDeIngreso,String carrera,boolean cuotaMensual) {
		super(dni,nombre,apellido,mail,direccion);
		setAnioIngreso(anioDeIngreso);
		setCarrera(carrera);
		setCuotaMensual(cuotaMensual);
	}
	
	//control de cuota mensual al dia
	private String checkCuotaMensual() {
		String check;
		if(cuotaMensual)
			check = "Al dia";
		else
			check = "Moroso";
		return check;
	}
	
	//devuelve String con todos los datos del Estudiante
	@Override
	public String toString() {
		String atributosEstudiante;
		atributosEstudiante = super.toString()+String.format("INGRESO: %d\nCARRERA: %s\nCUOTA MENSUAL: %s",anioIngreso,carrera,checkCuotaMensual());
		return atributosEstudiante;
	}
}
