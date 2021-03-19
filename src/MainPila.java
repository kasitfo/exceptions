
public class MainPila {

	public static void main(String[] args) {
		Pila p = new Pila(10);

		for (int i = 0; i < 11; i++) {
			try {
				p.apilar(i);
			} catch (PilaLlena e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(p);
		try {
			p.desapilar();
		} catch (PilaVacia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.desapilar();
		} catch (PilaVacia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.desapilar();
		} catch (PilaVacia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(p);
		try {
			System.out.println(p.verCima());
		} catch (PilaVacia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.apilar(666);
		} catch (PilaLlena e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
