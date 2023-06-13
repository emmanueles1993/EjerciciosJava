
public class Factorial2 {
	
 public static void main(String[] args) {
	 
	for(int fila = 1;fila <=10; fila++) {
		System.out.print(fila + "! = ");
		for(int columna = 1; columna<= fila; columna ++) {
		System.out.print(columna);
		if(columna<fila) {
			System.out.print(" x ");
			
		}
		
		
		
		}
		 
		System.out.print(" = "  );
		System.out.println();
	}
}
}
