package exerciciosVetores;

import java.util.Scanner;

public class Lista02_exercício04 {

	public static void main(String[] args) {
		double notas[][]= new double [10][4];
		Scanner leia = new Scanner(System.in);

        for (int participante = 0; participante < 10; participante++) {
            System.out.println("Notas do participante " + (participante + 1) + ":");
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                System.out.println("Digite a nota do bimestre " + (bimestre + 1) + ": ");
                notas[participante][bimestre] = leia.nextDouble();
            }
        }

        double[] medias = new double[10];
        for (int participante = 0; participante < 10; participante++) {
            double soma = 0;
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                soma += notas[participante][bimestre];
            }
            medias[participante] = soma / 4;
        }

        System.out.println("\nMédias dos participantes:");
        for (int participante = 0; participante < 10; participante++) {
        	System.out.printf("Participante %d: %.1f\n", (participante + 1), medias[participante]);
        }

        leia.close(); 
    }
}