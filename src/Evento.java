import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
	//Atributos
	private String nombre;
	private int id;
	private static int contadorEventos = 1;
	
	private int presupuesto;
	private boolean aprobado;
	private Organizador creador;
	
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	//Constructores
	public Evento(String nombre, int presupuesto, Organizador creador) {
		this.nombre = nombre;
		this.id = contadorEventos++;
		this.presupuesto = presupuesto;
		this.creador = creador;
		this.aprobado = false;
	}
	
	public Evento(String nombre, String inicio, String fin, int presupuesto, Organizador creador) {
		this.nombre = nombre;
		this.id = contadorEventos++;
		this.inicio = LocalDateTime.parse(inicio, formato);
		this.fin = LocalDateTime.parse(fin, formato);
		this.presupuesto = presupuesto;
		this.creador = creador;
		this.aprobado = false;
		
	}
	//Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public boolean getAprobado() {
		return this.aprobado;
	}
	
	public void aprobar() {
		this.aprobado = true;
	}
	
	public int getPresupuesto() {
		return this.presupuesto;
	}
	
	public Organizador getCreador() {
		return this.creador;
	}
	
	//Sobreescritos
	@Override
	public String toString(){
		String info = this.id+". "+this.nombre;
		if(this.inicio != null && this.fin != null) {
			info += " (" + this.inicio.format(formato) + " - " + this.fin.format(formato) + ")";
		}
		return info;
	}

}

