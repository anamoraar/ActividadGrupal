import java.util.ArrayList;

public class Organizacion {
	
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Evento> eventos;
	private ArrayList<Donacion> donaciones;
	private int dineroTotal;
	private int dineroDisponible;
	private int dineroComprometido;
	
	public Organizacion(String nombre) {
		this.nombre = nombre;
		this.usuarios = new ArrayList<Usuario>();
		this.eventos = new ArrayList<Evento>();
		this.donaciones = new ArrayList<Donacion>();
		this.dineroTotal = 0;
		this.dineroDisponible = 0;
		this.dineroComprometido = 0;
	}
	
	public Voluntario agregarVoluntario(String nombreCompleto, String telefono, String correoElectronico) {
		Voluntario v1 = new Voluntario(this, nombreCompleto, telefono, correoElectronico);
		usuarios.add(v1);
		return v1;
	}
	
	public Organizador agregarOrganizador(String nombreCompleto, String telefono, String correoElectronico) {
		Organizador o1 = new Organizador(this, nombreCompleto, telefono, correoElectronico);
		usuarios.add(o1);
		return o1;
	}
	
	public Usuario getUsuario(int indice) {
		return this.usuarios.get(indice);
	}
	
	public ArrayList<Evento> getEventos(){
		return this.eventos;
	}
	
	public ArrayList<Donacion> getDonaciones(){
		return this.donaciones;
	}
	
	
	public void ajustarDineroDisponible() {
		this.dineroDisponible = this.dineroTotal - this.dineroComprometido;
	}
	
	public void agregarDonacion(Donacion dona) {
		this.donaciones.add(dona);
		this.dineroTotal += dona.getMonto();
		this.ajustarDineroDisponible();
	}

	public void aprobarEvento(Evento evento, Organizador org) {
		if(!evento.getCreador().equals(org) && this.dineroDisponible - evento.getPresupuesto() >= 0) {
			evento.aprobar();
			this.dineroComprometido += evento.getPresupuesto();
			this.ajustarDineroDisponible();
			System.out.println("Evento aprobado");
		}
		else {
			System.out.println("Evento no aprobado");
		}

	}
}
