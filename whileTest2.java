import java.util.Scanner;

public class WhileTest2
{ 
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);
		boolean continuar = false;

		do{
			System.out.println("Ingrese el primer valor");
			int valor1 = teclado.nextInt();
			System.out.println("Ingrese el segundo valor");
			int valor2 = teclado.nextInt();
			System.out.println("--------------------------");
			System.out.println("Seleccione su opcion");
			System.out.println("1 = Suma");
			System.out.println("2 = Resta");
			System.out.println("3 = Mult");
			System.out.println("4 = div");
			System.out.println("5 = cambiar los valores");
			System.out.println("6 = Exit");
			int menu = teclado.nextInt();
			System.out.println("Resultado = ");

			switch(menu){
				case 1: System.out.println(valor1+valor2);
				break;
				case 2: System.out.println(valor1-valor2);
				break;
				case 3: System.out.println(valor1*valor2);
				break;
				case 4: System.out.println(valor1/valor2);
				break;
				case 5:WhileTest2.main(null);
				break;
				case 6: System.exit(0);
				break;

			}

			System.out.println("--------------------------");
			System.out.println("Intente de nuevo Y/N ");
			char continuarChar = teclado.next().charAt(0);
			continuar = false;
			if(continuarChar == 'Y' ||continuarChar == 'y' ){
				continuar = true;
			}

		}while(continuar);
	}
}
