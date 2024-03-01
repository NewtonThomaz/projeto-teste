package atividades;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		//Variáveis
		String n;
		int i;
		
		//instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Qual o seu nome? ");
		n = ler.nextLine();

		System.out.println("Qual a sua idade? ");
		i = ler.nextInt();

		//Sáida de dados
		System.out.print("Você se chama " + n);
		System.out.print(" e sua idade é " + i);

	}

}
