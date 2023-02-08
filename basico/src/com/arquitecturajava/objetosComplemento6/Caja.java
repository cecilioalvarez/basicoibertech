package com.arquitecturajava.objetosComplemento6;

public class Caja {

	private Pack2Regalos pack1;
	private Pack2Regalos pack2;
	private Regalo regalo;
	public Pack2Regalos getPack1() {
		return pack1;
	}
	public void setPack1(Pack2Regalos pack1) {
		this.pack1 = pack1;
	}
	public Pack2Regalos getPack2() {
		return pack2;
	}
	public void setPack2(Pack2Regalos pack2) {
		this.pack2 = pack2;
	}
	public Regalo getRegalo() {
		return regalo;
	}
	public void setRegalo(Regalo regalo) {
		this.regalo = regalo;
	}
	public Caja(Pack2Regalos pack1, Pack2Regalos pack2, Regalo regalo) {
		super();
		this.pack1 = pack1;
		this.pack2 = pack2;
		this.regalo = regalo;
	}
	
	public double getPrecio() {
		
		return pack1.getPrecio()+pack2.getPrecio()+regalo.getPrecio();
	}
	
	
	public Regalo esMasCaro() {
		
		Regalo regaloPackCaro=null;
		
		
		if (pack1.getRegaloMasCaro().getPrecio()>pack2.getRegaloMasCaro().getPrecio()) {
			
			regaloPackCaro=  pack1.getRegaloMasCaro();
		}else {
			regaloPackCaro= pack2.getRegaloMasCaro();
		}
		
		if (regaloPackCaro.getPrecio()>regalo.getPrecio()) {
			
			return regaloPackCaro;
		}else {
			
			return regalo;
		}
		
	}

	
	
	
	
}
