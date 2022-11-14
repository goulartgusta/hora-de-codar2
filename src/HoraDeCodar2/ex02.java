package HoraDeCodar2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
//2. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int n1 = ler.nextInt();
        System.out.println("Informe o segundo valor:");
        int n2 = ler.nextInt();
        System.out.println("Informe o terceiro valor:");
        int n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O primeiro valor de " + n1 + " é maior ");
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("O segundo valor de " + n2 + " é maior ");
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("O terceiro valor de " + n3 + " é maior ");
        }
        ler.close();
    }
}
