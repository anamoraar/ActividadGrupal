import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Donacion {
	private int monto;
	private LocalDateTime fecha;
	private Usuario donador;
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	public Donacion(Usuario donador, int monto, String fecha) {
		this.donador = donador;
		this.monto = monto;
		this.fecha = LocalDateTime.parse(fecha, formato);
	}
	
	public int getMonto() {
		return this.monto;
	}
	
	public Usuario getDonador() {
		return this.donador;
	}
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	


}
