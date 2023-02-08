package com.arquitecturajava.objetosComplemento7;

import java.util.ArrayList;
import java.util.List;

public class Piso implements Encendible {

	private List<Habitacion> habitaciones= new ArrayList<>();
	
	
	public boolean add(Habitacion e) {
		return habitaciones.add(e);
	}
	
	

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}



	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}



	@Override
	public void on() {
		
		for (Habitacion h: habitaciones) {
			
			h.on();
		}

	}

	@Override
	public void off() {
		
	for (Habitacion h: habitaciones) {
			
			h.off();
		}

	}



	@Override
	public boolean isEncendida() {
		// TODO Auto-generated method stub
		return false;
	}

}
