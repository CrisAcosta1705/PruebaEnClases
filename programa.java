package ArraylistTipoInteger;
import java.util.Scanner;
import java.util.ArrayList;
public class programa {

	public static void main(String[] args) {
	
	ArrayList<Integer> numeros = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	
	
	System.out.println("Ingrese una serie de numeros (termina en -99): ");
	
	int numero;
	
	while (true) {
	numero = scanner.nextInt();
	if (numero ==-99) {
	break;
	
	}
	numeros.add(numero);
	}
	
	
		
	int suma = 0;
	int numeroMayor = numeros.get(0);
	int numeroMenor = numeros.get(0);
	
	for(int i = 0; i < numeros.size(); i++) {
	int valor = numeros.get(i);
	
	suma += valor;
	
	if (valor > numeroMayor) {
	numeroMayor = valor;
	
	}
	if (valor < numeroMenor) {
	numeroMenor = valor;
		}
	}
	
	int cantidad = numeros.size();
	double media = (double) suma / cantidad;
	
	System.out.println("Cantidad de los valores leidos: "+cantidad);
	System.out.println("Suma de los valores leidos: "+suma);
	System.out.println("Media de los valores leidos: "+media);
	System.out.println("Numero mayor de los valores leidos: "+numeroMayor);
	System.out.println("Numero menor de los valores leidos: "+numeroMenor);
	

		}
	}