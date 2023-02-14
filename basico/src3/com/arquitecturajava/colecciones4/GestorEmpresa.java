package com.arquitecturajava.colecciones4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestorEmpresa {

	Map<Empresa,List<Factura>> empresas= new HashMap<Empresa,List<Factura>>();
	
	
	
	
	public void addEmpresaFactura(Empresa empresa, Factura factura) {

		if (empresas.containsKey(empresa)) {

			empresas.get(empresa).add(factura);
		} else {

			List<Factura> facturas = new ArrayList<Factura>();
			facturas.add(factura);
			empresas.put(empresa, facturas);
		}

	}
	
	public double getMediaFacturaEmpresas(Empresa e) {

		List<Factura> facturas= empresas.get(e);
		double total=0;
		
		for (Factura f : facturas) {

			total+=f.getImporte();
		}
		return total/facturas.size();
	}
	
	
	public double getMediaTotal() {

		Set<Empresa> conjunto= empresas.keySet();
		
		double total=0;
		for (Empresa e : conjunto) {

			total+=getMediaFacturaEmpresas(e);
		}
		return total/conjunto.size();
	}
	
}
