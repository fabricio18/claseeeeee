import java.util.Scanner;
public class variables {

	public static void main(String[] args) {
		     
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un numero1:");
		int num1= s.nextInt();
		System.out.print("Ingrese un operador (+,-,*,/):");
		char operador = s.next().charAt(0);
		System.out.print("Ingrese un numero2:");
		int num2= s.nextInt();
		
		switch (operador)
		{
		case '+' :
		System.out.print("Resultado: "+(num1+num2));
		break;
		case '-' :
		System.out.print("Resultado: "+(num1-num2));
		break;
		case '*' :
			System.out.print("Resultado: "+(num1*num2));
			break;
		case '/' :
			System.out.print("Resultado: "+(num1/num2));
			break;
			default:
				System.out.print("Operador desconocido");
				break;
		}
		  
		}

	}


