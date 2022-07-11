package DesafiosResolucoes;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        int v1 = 0, v2 = 1, v3 = 0, i;
        Scanner digitador = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numInformado = digitador.nextInt();

        while (numInformado > v3) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        if (numInformado == 0) {
            System.out.println("O número está na Sequência de Fibonacci.");
        } else if (numInformado == v3) {
            System.out.println("O número " + numInformado + " está na sequência de Fibonacci.");
        } else {
            System.out.println("Este número não faz parte da Sequência de Fibonacci.");

        }
    }
}










