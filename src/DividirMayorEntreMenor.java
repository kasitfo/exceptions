import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirMayorEntreMenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int a, b;
		double resultado = 0;
		
		try {
			System.out.println("Introdueïx un número");
			a = entrada.nextInt();
			System.out.println("Introdueïx un segon número");
			b = entrada.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Se tiene que introducir un número entero");
			a = 1;
			b = 1;
		}
		
		try {
			resultado = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Division entre 0");
		}
		
		
		
		
	}

}
