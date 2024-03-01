package atividades;
import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		//Variáveis
		double horatraba, valorhora, salabruto, salliqui, inss;

		//instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Quantas horas você trabalhou? ");
		horatraba = ler.nextDouble();

		System.out.println("Quanto vale suaa hora trabalhada? ");
		valorhora = ler.nextDouble();

		//Processamento
		salabruto = valorhora * horatraba;
		inss = salabruto * 0.12;
		salliqui = salabruto - inss;

		//Sáida de dados
		System.out.print("O valor do seu salario bruto é: " + salabruto + "," );
		System.out.print(" e o seu salario liquido é: " + salliqui +".");

	}

}
