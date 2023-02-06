package com.arquitecturajava.objetos4;

public class Ordenador {

	private String modelo;
	private Monitor monitor;
	private CPU cpu;
	public Ordenador(Monitor monitor, CPU cpu) {
		super();
		this.modelo = modelo;
		this.monitor = monitor;
		this.cpu = cpu;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	public double getPrecio() {
		
		return cpu.getPrecio()+monitor.getPrecio();
	}
}
