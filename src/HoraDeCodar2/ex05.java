package HoraDeCodar2;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
//5 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever
// a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado
// (considere 6.0 a média mínima para aprovação e 4 notas informadas).
        Scanner ler = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i < 4; i++ ){
            System.out.print("Digite a nota do aluno: ");
            int notas = ler.nextInt();

            while( notas > 10 || notas < 0 ){
                System.out.print("Por favor digite uma nota maior que 0 e menor que 10: ");
                notas = ler.nextInt();
            }

            soma += notas;
        }

        double media = soma/4;
        System.out.println("Sua média foi " + media);

        if( media >= 6 ){
            System.out.println("PARABÉNS! Você foi aprovado !!");
        } else{
            System.out.println("Que pena, você foi reprovado...");
        }
        ler.close();
    }
}
