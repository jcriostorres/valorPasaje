# valorPasaje
Calcular el valor de un pasaje dado la distancia en km
Read me

ALGORITMO PARA DETERMINAR EL VALOR DEL PASAJE

Herramientas utilizadas:

•	Eclipse JEE 2019
•	Base de datos Mysql Workbech 8.0
•	Github

En un principio decidí realizar un pequeño CRUD, donde se pudiera crear, leer, actualizar eliminar los destinos a viajar, y realizar los calculos del valor total a pagar en una sola página SPA, 
con frontend con Angular 10 y backend 5 Spring, spring Boot 2, API REST, pero por problemas con la conexión a bases de datos Mysql por la terminal e intente realizar la BD desde Workbech, 
además de problemas de incompatibilidad de versiones de Springboot, me tomo casi todo el tiempo en corregir el error.
 

Decidí enfocarme en el análisis del algoritmo, los requerimiento funcionales, verifique las entradas y las salidas del cliente.

R1 determinar el valor del pasaje del cliente

Entradas: la distancia en Km  el número de días de estadía.

Resultado: el valor a pagar total sin descuento y con descuento según las condiciones dadas como las constantes para el descuento como el porcentaje de descuento y 
el precio por cada km recorrido.

Algoritmo:
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
		valorDescuento = valorTotalSinDescuento * DESCUENTO
		if (dias > 7 && km > 1000) {
			
			valorTotalConDescuento = valorTotalSinDescuento - valorDescuento
			JOptionPane.showMessageDialog(null, "el total con descuento a pagar de su viaje es: " + valorTotalConDescuento);
		}

		else {
			valorTotalSinDescuento
		}
		
		JOptionPane.showMessageDialog(null, "el total sin descuento a pagar de su viaje es: " + valorTotalSinDescuento);
	}
