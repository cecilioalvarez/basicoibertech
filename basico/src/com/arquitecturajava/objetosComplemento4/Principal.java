package com.arquitecturajava.objetosComplemento4;

public class Principal {

	public static void main(String[] args) {

		Corredor c = new Corredor("pedro", new Zapatilla(), 9);

		c.correr();
		c.setCalzado(new ZapatillaRunning());

		c.correr();

		c.setCalzado(new ZapatillaBaloncesto());

		c.correr();

		c.setCalzado(new BotaMontaña());

		c.correr();

	}

}
