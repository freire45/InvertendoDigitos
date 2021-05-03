package br.com.erickfreire.invertendodigitos;

import java.util.Scanner;

/**
 * Programa em Java que inverte um digito fornecido pelo usuário
 * @author Erick Freire
 * @version 1 - Criado em 03-05-2021 as 17:53
 */

public class InvertendoDigitos {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que inverte um número: ");
		
		System.out.print("Informe um valor inteiro de 5 digitos: ");
		numero = entrada.nextInt();
		
		while(numero < 9999 || numero > 99999) {
			System.out.print("Número Incorreto - Informe um valor inteiro de 5 digitos: ");
			numero = entrada.nextInt();
		}
		
		inverteNumero(numero);

	}
	
	public static void inverteNumero(int n) {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		numero1 = n / 10000;
		numero2 = (n % 10000) / 1000;
		numero3 = (n % 1000) / 100;
		numero4 = (n % 100) / 10;
		numero5 = (n % 10) / 1;
		
		System.out.printf("%n%nO número invertido é: %d%d%d%d%d %n", numero5, numero4, numero3, numero2, numero1);
	}

}
