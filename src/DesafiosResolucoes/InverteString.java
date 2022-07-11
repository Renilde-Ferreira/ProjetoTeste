package DesafiosResolucoes;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        String palavra = leitor.next();
        String novaPalavra = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));

        }
        System.out.println(novaPalavra);
    }
}

