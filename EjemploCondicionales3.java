
public class EjemploCondicionales3 {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 17;
		int cantidad = 2;

		// if (edad >= 18 || cantidad >= 2) {
			if (edad >= 18 && cantidad >= 2) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no esta permitido para entrar");
		}
	}
}
