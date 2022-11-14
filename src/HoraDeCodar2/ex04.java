package HoraDeCodar2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
//4.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados
// e escreva a média aritmética desses valores lidos.
        Scanner ler = new Scanner(System.in);
        int soma = 0;

        for( int i = 0; i <10; i++ ){
            System.out.print("Digite um valor: ");
            int num = ler.nextInt();
            soma += num;
        }

        System.out.println("A média da soma dos valores é " + soma/10);
        ler.close();
    }
}
