package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Persona estu1 = new Estudiante(39647094,"Andres","Lederer Dobra","dobrandres@email.com","Don Donald's St. 24",2017,"Software Development",true);
		Persona staff1 = new Staff(12345678,"Pam","Johnnson","impam@email.com","White Ladies Road 80",600,"Maniana");
		
		System.out.println("[ESTUDIANTE]\n"+estu1.toString());
		System.out.println("===================================");
		System.out.println("[STAFF ACADEMICO]\n"+staff1.toString());
	}

}
