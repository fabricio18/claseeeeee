import java.util.Scanner;
public class ffdfdfd {

	public static void main(String[] args) {
		Scanner lea=new Scanner(System.in);
		
	
		System.out.print("FICHA PERSONAL");
		System.out.print("ingrese su nombre");
		String nombre=lea.next();
		System.out.print("ingrese su edad");
		int edad=lea.nextInt();
		System.out.println("ingrese su sexo");
		char sexo=lea.next().charAt(0);
		System.out.println("esta soltero (true/false)?");
		boolean soltero=lea.nextBoolean();
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(sexo);
		System.out.println(soltero);
		
	
}

	}


