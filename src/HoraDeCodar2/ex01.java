package HoraDeCodar2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
//1 - Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        int n = ler.nextInt();
        if (n > 0) {
            System.out.println("O numero é positivo.");
        }
        else if (n < 0) {
            System.out.println("O numero é negativo.");
        }
        else {
            System.out.println("O numero é zero.");
        }
        ler.close();
    }
}
