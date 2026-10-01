/*
Ejercicio F0:
	- El programa se ejecuta bajo main
	- Se declara IVA como double: 0.21
	- Pedir por teclado:
		- Nombre
		- Letra identificativa de la sección
		- Cantidad de unidades adquiridas
		- Precio por unidad
	- Calcular el subtotal multiplicando unidades por precio
	- Calcular el total somando el 0.21%
	- Evaluar si el cliente tiene descuento:
		- Si son más de 5 unidades Y el IVA
		  supera 50, se almacena en una variable
		  boolean
	- Obtener los puntos de fidelidad truncando el
	  importe total con IVA a un número entero
	  mediante conversión explícita
	- Mostrar subtotal y total con dos decimales y
	  los puntos enteros
*/
import java.util.Scanner;
public class Practica1_ElementosBasicos {
	public static void main (String[] args) {
		// Creamos el escaner sc
		Scanner sc = new Scanner(System.in);

		// Pedimos todos los datos
		final double IVA = 0.21;
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		System.out.print("\nLetra ID: ");
		char id = sc.next().charAt(0);
		System.out.print("\nCantidad: ");
		int number = sc.nextInt();
		System.out.print("\nPrecio: ");
		double price = sc.nextDouble();
		
		// Calculamos subtotal (unidades * precio)
		double subtotal = number * price;
		double total = subtotal + subtotal * IVA;

		// Comprobación de descuento
		boolean discount = (number > 5 && total > 50.0);

		// Puntos de fidelidad
		int points = (int) (total);

		// Salida final
		System.out.println("\nNombre del cliente: " + name);
		System.out.println("Código de sección: " + id);
		System.out.println("Número de artículos: " + number);
		System.out.printf("Precio unitario: %.2f", price);

		System.out.println(
			"\nCliente: " + name +
			" | Sección: " + id
		);
		System.out.printf("Subtotal: %.2f", subtotal);
		System.out.printf("\nTotal con IVA: %.2f", total);
		System.out.println("\nDescuento aplicable: " + discount);
		System.out.print("Puntos acumulados: " + points);

		// Cerramos el escaner sc
		sc.close();
	}
}
