package com.ejemplo.springboot.backend.apirest.models.entity;

import javax.swing.JOptionPane;
import java.util.*;

public class Destino {

	private long id;
	private int dias;
	private int km;
	private String origen;
	private String destination;
	private double DESCUENTO;
	private double total;

	// metodo

	public void calcularPasaje() {
		JOptionPane.showMessageDialog(null, "Calcular pasaje");
		int dias = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos dias sera su viaje"));
		int km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los kilometros de recorrido de el viaje"));

		if (dias > 7 && km > 1000) {
			DESCUENTO = 0.30;
		}

		else {
			DESCUENTO = 1;
		}
		km = km * 35000;
		DESCUENTO = km * DESCUENTO;
		total = dias + km - DESCUENTO;
		JOptionPane.showMessageDialog(null, "el total a pagar de su viaje es: " + total);
	}

}