
public abstract class Usuario {
	//Atributos
	protected Organizacion org;
	private static int contadorUsuarios = 10;
	private int id;
	private String nombreCompleto;
	private String telefono;
	private String correoElectronico;
	
	//Constructor
	public Usuario(Organizacion org, String nombreCompleto, String telefono, String correoElectronico) {
		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.id = contadorUsuarios++;
		this.org = org;
	}
	//Getters y Setters
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}
	
	
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
	@Override
	public String toString() {
		return ">Nombre: "+this.nombreCompleto+'\n'+">ID: "+this.id+'\n'+">Teléfono: "+this.telefono+'\n'+">Correo Electrónico: "+this.correoElectronico;
	}
	
	public void hacerDonacion(int monto, String fecha) {
		Donacion dona = new Donacion(this, monto, fecha);
		this.org.agregarDonacion(dona);
	}
}
