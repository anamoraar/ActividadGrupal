import java.util.ArrayList;

public class Voluntario extends Usuario {
	//Atributos
	protected ArrayList<Evento> eventos;
	
	//Constructor
	public Voluntario(Organizacion org, String nombre, String telefono, String correoElectronico) {
		super(org, nombre, telefono, correoElectronico);
		eventos = new ArrayList<Evento>();
	}
	
	//Metodos
	public void inscribirseEnEvento(Evento evento) {
		if(evento.getAprobado()) {
			this.eventos.add(evento);
			System.out.println("Inscripcion exitosa");
		}
		else {
			System.out.println("Inscripcion no valida");
		}
	}
	
	
	public void listarEventos() {
		if(this.eventos.isEmpty()) {
			System.out.println("No tiene eventos asociados");
		}
		else {
			System.out.println(">Eventos asociados:");
			for(int i = 0; i<this.eventos.size(); i++) {
				System.out.println(this.eventos.get(i).toString());
			}
		}
		System.out.println();
	}

}
