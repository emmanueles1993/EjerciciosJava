public class EjemploBooleano2 {
	
		public static void main(String[] args) {
			System.out.println("Hello world");

			int edad = 21;
			int cantidadPersonas = 2;

			boolean espareja = cantidadPersonas>1;
			System.out.println("El valor de la condicion es :" + espareja);
			if(edad >= 18 && espareja) {
			System.out.println("Usted puede entrar");
			}
			else {
				System.out.println("Usted no esta permitido a entrar");
			}
		}
	}

