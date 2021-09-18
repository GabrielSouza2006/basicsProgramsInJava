/*Escreva um programa que, com base em uma temperatura em graus celsius, 
 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F).
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.conversao;

public class celsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		conversao cover = new conversao();
		
		System.out.println("Enter the temperature in degrees celcius: ");
		Double c = sc.nextDouble();
		cover = new conversao(c);
		
		System.out.println();
		System.out.println(cover);
		
		sc.close();
	}

}
