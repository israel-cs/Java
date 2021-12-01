package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantas notas serão calculadas? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		System.out.println("Digite as médias.");
		for (int i=0;i<n;i++) {
			vetor[i] = sc.nextDouble();			
		}
		
		System.out.println();
		double soma = 0;
		for (int i=0;i<n;i++) {
			soma += vetor[i];			
		}
		double resultado = soma/n;
		System.out.printf("A média: %.2f%n", resultado);
		sc.close();
	}
}