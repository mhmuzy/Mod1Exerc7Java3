package Hitss.Treinamento.Infra;

import java.util.Scanner;

public class Controller {
	public static void Play() {
		try {
			
		
		double[] Nota1 = new double[4];
		Nota1[1] = 7.0;
		Nota1[2] = 8.5;
		Nota1[3] = 7.5;
		
		double[] Nota2 = new double[4];
		Nota2[1] = 8.0;
		Nota2[2] = 7.3;
		Nota2[3] = 9.5;
		
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("(1) - Escolher Média Aritmética");
		System.out.println("(2) - Escolher Média Ponderada");
		System.out.println("(3) - Sair");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("Escolha a Opção Desejada:");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int opcao = 0; 
		
		while (opcao < 3) {	
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println("(1) - Escolher Média Aritmética");
			System.out.println("(2) - Escolher Média Ponderada");
			System.out.println("(3) - Sair");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println("Escolha a Opção Desejada:");
			System.out.println("");
			opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("");
			System.out.println("    Resultado da Consulta");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			for (int i = 1; i < Nota1.length; i++) {
				ElaborarMediaAritmetica(i, Nota1[i], Nota2[i]);
			}
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");

			break;
		case 2:
			System.out.println("");
			System.out.println("    Resultado da Consulta");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			for (int i = 1; i < Nota1.length; i++) {
				ElaborarMediaPonderada(i, Nota1[i], Nota2[i]);
			}
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");

			break;
		case 3:
			System.out.println("");
			System.out.println("Até Logo!");
			break;
		default:
			System.out.println("");
			System.out.println("Opção Inválida.");
			break;
		}
		
		
		
		
		}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Opção Inválida.");
		}
	}
	
	public static void ElaborarMediaAritmetica(int mat, double n1, double n2) {
		 double m = (n1 + n2) / 2;
		 System.out.println("A Média Ponderada do(a) Aluno(a) " + mat + " é: " + m);
	}
	
	public static void ElaborarMediaPonderada(int mat, double n1, double n2) {
		 double m = (n1 + n2) / 2;
		
		if (m >= 0.0 && m <= 2.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: E");
		} else if(m >= 3.0 && m <= 4.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: D");
		} else if(m >= 5.0 && m <= 6.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: C");
		} else if(m >= 7.0 && m <= 8.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: B");
		} else {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: A");
		} 
	}
}
