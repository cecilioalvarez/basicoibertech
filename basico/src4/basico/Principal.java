package basico;

public class Principal {

	public static void main(String[] args) {
		
		Bolsa<Caramelo> b= new Bolsa<Caramelo>(5);
		b.addElemento(new Caramelo("fresa"));
		b.addElemento(new Caramelo("limon"));
		b.addElemento(new Caramelo("fresa"));	
		b.addElemento(new Caramelo("menta"));
		
		b.addElemento(new Caramelo("fresa"));
		b.addElemento(new Caramelo("limon"));
		b.addElemento(new Caramelo("fresa"));	
		b.addElemento(new Caramelo("menta"));
		
		for (Caramelo c : b.getLista()) {
			
			System.out.println(c.getSabor());
		}

	}

}
