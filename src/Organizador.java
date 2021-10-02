import java.util.ArrayList;

public class Organizador extends Voluntario{
	
	private ArrayList<Evento> eventosCreados;
	
	public Organizador(Organizacion org, String nombre, String telefono, String correoElectronico) {
		super(org, nombre, telefono, correoElectronico);
		eventosCreados = new ArrayList<Evento>();
	}
	
	public Evento agregarEvento(String nombre, String inicio, String fin, int presupuesto) {
		Evento evento = new Evento(nombre, inicio, fin, presupuesto, this);
		this.eventosCreados.add(evento);
		this.org.getEventos().add(evento);
		return evento;
	}
	
	public Evento agregarEvento(String nombre, int presupuesto) {
		Evento evento = new Evento(nombre, presupuesto, this);
		this.eventosCreados.add(evento);
		this.org.getEventos().add(evento);
		return evento;
	}
	
	@Override
	public String toString() {
		String info = super.toString()+'\n'+">Eventos por asistir:";
		for(int i = 0; i<this.eventos.size(); i++) {
			info += '\n'+this.eventos.get(i).toString();
		}
		info += '\n'+">Eventos creados:";
		for(int i = 0; i<this.eventosCreados.size(); i++) {
			info += '\n'+this.eventosCreados.get(i).toString();
		}
		return info;
	}
	
	public void aprobarEvento(Evento evento) {
		this.org.aprobarEvento(evento, this);
	}

}
