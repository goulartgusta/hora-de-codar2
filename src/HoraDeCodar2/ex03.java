package HoraDeCodar2;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
//3. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro número?");
        int n1 = ler.nextInt();
        System.out.println("Qual o segundo número?");
        int n2 = ler.nextInt();
        System.out.println("Qual o terceiro número?");
        int n3 = ler.nextInt();
        int soma;

        if (n3 < n1 && n1 < n2) {
            soma = n1 + n2;
            System.out.println("A soma será: " + soma);
        }

        else if (n2 < n1 && n1 < n3) {
            soma = n1 + n3;
            System.out.println("A soma será: " + soma);
        }

        else if (n1 > n3) {
            soma = n1 + n2;
            System.out.println("A soma será: " + soma);
        }
        else {
            soma = n2 + n3;
            System.out.println("A soma será: " + soma);
        }
        ler.close();
    }
}
