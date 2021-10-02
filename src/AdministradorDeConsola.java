import java.util.Scanner;

public class AdministradorDeConsola {
	private static Scanner scanner = new Scanner(System.in);
	private static Organizacion org;
	
	public static Voluntario crearVoluntario() {
		Voluntario vol;
		String nombre, telefono, correo;
		System.out.println("Escriba el nombre del nuevo voluntario: ");
		nombre = scanner.nextLine();
		System.out.println("Escriba el teléfono del nuevo voluntario: ");
		telefono = scanner.nextLine();
		System.out.println("Escriba el correo del nuevo voluntario: ");
		correo = scanner.nextLine();
		vol = new Voluntario(org, nombre, telefono, correo);
		System.out.println("Voluntario creado exitosamente");
		return vol;
	}

	
	public static Organizador crearEvento(Organizador org) {
		while(true) {
			String parar;
			System.out.println("Si desea inscribirse en un evento ingrese 1, si no ingrese 0");
			parar = scanner.nextLine();
			if(parar.equals("0")) {
				break;
			}
			String nombre;
			System.out.println("Ingrese el nombre del evento: ");
			nombre = scanner.nextLine();
			int presupuesto;
			System.out.println("Ingrese el presupuesto del evento: ");
			presupuesto = scanner.nextInt();
			String quiereFecha;
			System.out.println("Si desea indicar el inicio y fin del evento ingrese 1, si no ingrese 0");
			quiereFecha = scanner.nextLine();
			if(quiereFecha.equals("1")) {
				String inicio, Final;
				System.out.println("Indique el inicio del evento en formato dd/MM/yyyy HH:mm: ");
				inicio = scanner.nextLine();
				System.out.println("Indique el final del evento en formato dd/MM/yyyy HH:mm: ");
				Final = scanner.nextLine();
				org.agregarEvento(nombre, inicio, Final, presupuesto);
			}
			else {
				org.agregarEvento(nombre, presupuesto);
			}
		}
		return org;
	}

}
