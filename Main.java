package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Persona estu1 = new Estudiante(39647094,"Andres","Lederer Dobra","dobrandres@email.com","Don Donald's St. 24",2017,"Software Development",false);
		Persona estu2 = new Estudiante(35698744,"Kelly","Slater","kellyslater@email.com","White Ladies Road 26",2020,"Software Development",true);
		Persona estu3 = new Estudiante(40255369,"Makuakai","Rothman","makuarothman@email.com","Mc Calvin St. 48",2018,"QA/Tester",true);
		Persona estu4 = new Estudiante(38456321,"Jhon","Jhon Florence","jhonjhonflorence@email.com","Pembrook St. 55",2020,"Cyber Security",false);
		
		Persona staff1 = new Staff(12345678,"Pam","Jhonnson","impam@email.com","White Ladies Road 80",600,"Maniana");
		Persona staff2 = new Staff(74125896,"Eliat","Thomson","ethomson@email.com","Devon's Road 88",400,"Noche");
		Persona staff3 = new Staff(45678921,"Penny","Barton","pennybarton@email.com","St. Louis 17",800,"Noche");
		Persona staff4 = new Staff(98765432,"Annais","Stainer","stainerana@email.com","Old Road 12",550,"Maniana");

		Persona [] colegio = {estu1,estu2,estu3,estu4,staff1,staff2,staff3,staff4};
		
		int cantEstudiante = 0;
		int cantStaff = 0;
		double sumatoriaSalarios = 0;
		for (Persona p : colegio) {
			if(p instanceof Estudiante) {
				System.out.println("[ESTUDIANTE]");
				System.out.println(((Estudiante) p).toString());
				cantEstudiante++;
			}
			if(p instanceof Staff) {
				System.out.println("[STAFF ACADEMICO]");
				System.out.println(((Staff) p).toString());
				sumatoriaSalarios +=  ((Staff) p).getSalario();
				cantStaff++;
			}
		}
		System.out.println("\nEN LA INSTITUCION HAY "+cantEstudiante+" PERSONAS ESTUDIANTES Y "+cantStaff+" PERSONAS DEL STAFF ACADEMCIO.");
		System.out.println(String.format("LA INSTITUCION GASTA $%.2f EN SALARIOS MENUSALES DEL STAFF ACADEMICO",sumatoriaSalarios));		
	}
}
