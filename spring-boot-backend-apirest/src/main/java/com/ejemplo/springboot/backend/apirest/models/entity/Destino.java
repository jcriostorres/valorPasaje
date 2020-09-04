package com.ejemplo.springboot.backend.apirest.models.entity;

import javax.swing.JOptionPane;
import java.util.*;

public class Destino {

	private long id;
	private int dias;
	private int km;
	final double DESCUENTO = 0.3;
	private double PRECIO = 35000;
	private double valorTotalSinDescuento;
	private double valorTotalConDescuento;
	private double valorDescuento;

	// pide datos de entrada

	public void calcularPasaje() {
		JOptionPane.showMessageDialog(null, "Calcular pasaje");
		int dias = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos dias sera su viaje"));
		int km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los kilometros de recorrido de el viaje"));

		//calculos
		double valorTotalSinDescuento = km * PRECIO;
		valorDescuento = valorTotalSinDescuento * DESCUENTO;
		if (dias > 7 && km > 1000) {
			
			valorTotalConDescuento = valorTotalSinDescuento - valorDescuento;
			JOptionPane.showMessageDialog(null, "el total con descuento a pagar de su viaje es: " + valorTotalConDescuento);
		}

		else {
			valorTotalSinDescuento;
		}
		
		JOptionPane.showMessageDialog(null, "el total sin descuento a pagar de su viaje es: " + valorTotalSinDescuento);
	}
}