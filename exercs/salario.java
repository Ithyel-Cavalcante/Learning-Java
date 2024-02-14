/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM = R$788,00)*/

package javaapplication1.exercicios;

import java.util.Scanner;

public class Exercicio4pdf {

    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
        float salmin, salminUser, quantSal;
        salmin = 788;
       
        System.out.println("Digite a quantia de salario que voce recebe: ");
        salminUser = input.nextFloat();
        
        quantSal = salminUser/salmin;
        
        System.out.println("Voce recebe "+quantSal+" salarios minimos");
        
        
       
    }
}
