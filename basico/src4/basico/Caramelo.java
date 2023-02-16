package basico;

public class Caramelo  implements Producto{

	private String sabor;

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Caramelo(String sabor) {
		super();
		this.sabor = sabor;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return 0.5;
	}
	
	
}
