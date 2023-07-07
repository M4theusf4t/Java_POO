package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TrianguloAula01;

public class ProgramaAula01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TrianguloAula01 x, y;
		x = new TrianguloAula01();
		y = new TrianguloAula01();
		
		
		System.out.println("Entre com as medidas do Triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do Triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior area é X");
		}else {
			System.out.println("A maior area é Y");

		}
		
		sc.close();
	}

}
