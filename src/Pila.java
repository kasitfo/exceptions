import java.util.Arrays;

public class Pila {
	private int capacidad;
	private int indice;
	private int datos[];
	
	public Pila(int capacidad) {
		this.capacidad = capacidad;
		indice = 0;
		datos = new int[capacidad];
	}
	
	public void apilar(int elem) throws PilaLlena {
		if (indice == capacidad) {
			throw new PilaLlena("La pila está llena");
		}
		datos[indice] = elem;
		indice++;
	}
	
	public int desapilar() throws PilaVacia {
		if (indice == 0) {
			throw new PilaVacia("La pila está vacía");
		}
		int resultado;
		resultado = datos[indice-1];
		indice--;
		return resultado;
	}
	
	public int verCima() throws PilaVacia{
		if (indice == 0) {
			throw new PilaVacia("La pila está vacía");
		}
		return datos[indice-1];
	}
	
	public void vaciarPila(){
		indice = 0; 
	}
	
	public int mostrarMenorElementoPila() throws PilaVacia{
		if (indice == 0) {
			throw new PilaVacia("La pila está vacía");
		}
		int minimo = datos[0];
		for(int i = 1; i < datos.length; i++) {
			if(datos[i] < minimo) {
				minimo = datos[i];
			}
		}
		return minimo;
	}
	
	public String toString() {
		String resultat = "";
		for(int i = 0; i < indice; i++) {
			resultat += datos[i] + " ";
		}
		return resultat;
	}

}