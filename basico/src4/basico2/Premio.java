package basico2;

public class Premio {

	private String nombre;
	private double importe;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Premio(String nombre, double importe) {
		super();
		this.nombre = nombre;
		this.importe = importe;
	}
	
	
}
