
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Voluntario v0 = AdministradorDeConsola.crearVoluntario();
		Voluntario vol1 = new Voluntario("Ana Mora", "88752650", "anamoraar@gmail.com");
		Voluntario vol2 = new Voluntario("Mateo Mena", "70723457", "mateo05@hotmail.com");
		Voluntario vol3 = new Voluntario("Sofía Salazar", "89279812", "sofs4@gmail.com");
		
*/
		Organizacion org = new Organizacion("Accion Union");
		Organizador organizador = org.agregarOrganizador("Sofia Salazar", "89279812", "sofs4@gmail.com");
		Organizador organizador2 = org.agregarOrganizador("Mateo Mena", "70723457", "mateo05@hotmail.com");
		Voluntario vol = org.agregarVoluntario("Maria Mora", "89990077", "maria@hotmail.com");
		organizador.hacerDonacion(2000, "30/09/2021 19:02");
		Evento e1 = organizador.agregarEvento("Limpieza calles", 2000);
		vol.inscribirseEnEvento(e1);
		organizador.aprobarEvento(e1);
		organizador2.aprobarEvento(e1);
		vol.inscribirseEnEvento(e1);
	}

}
