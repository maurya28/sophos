package src.reto1;
import java.util.Scanner; //tipo.paquete.clase

import reto1.Mensaje;

public class Main {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		teclado = new Scanner(System.in);				
		
		System.out.println ("Escriba un mensaje de bienvenida:");// clase print va sacar algo del sistemas
			
		String mensaje= teclado.nextLine();
		
		System.out.println ("\n");
		
		Mensaje b = new Mensaje();
			
		b.mensaje(mensaje);
			
		
	}

}
