package ejercicio2;

public class Staff extends Persona{
	//atributos Staff academico
	private double salario;
	private String turno;
	
	//settters
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	//getters
	public double getSalario() {
		return salario;
	}
	public String getTurno() {
		return turno;
	}
	
	//constructor
	public Staff(int dni,String nombre,String apellido,String mail,String direccion,double salario,String turno) {
		super(dni,nombre,apellido,mail,direccion);
		setSalario(salario);
		setTurno(turno);
	}
	
	//calcula y devuelve salarioAnual
	public double getSalarioAnual() {
		return (salario*12);
	}
	
	//devuelve String con todos los datos del Staff academico
	@Override
	public String toString() {
		String atributosStaff;
		atributosStaff = super.toString()+String.format("SALARIO: $%.2f\nSALARIO ANUAL: $%.2f\nTURNO: %s",salario,getSalarioAnual(),turno);
		return atributosStaff;
	}
}
