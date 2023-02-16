package basico;

public class Principal2 {

	public static void main(String[] args) {
		
		Bolsa<Producto> b= new Bolsa<Producto>(5);
		b.addElemento(new Donut());
		b.addElemento(new Donut());
		b.addElemento(new Caramelo("fresa"));
		b.addElemento(new Donut());
		b.addElemento(new Donut());
		b.addElemento(new Donut());
		
		
		for (Producto d : b.getLista()) {
			
			System.out.println(d.getPrecio());
		}
		
		System.out.println(b.precioFinal());

	}

}
