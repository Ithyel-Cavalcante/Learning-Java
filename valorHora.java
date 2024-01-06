/*Escreva um programa que retorne o valor hora de um funcionario com 
base em seu salário mensal e horas trabalhadas mensalmente*/

package javaapplication1.exercicios;

import java.util.Scanner;

public class SalarioHora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float salario, horas, valorHora;
        
        System.out.println("Digite o salario mensal do funcionario: ");
        salario = input.nextFloat();
        
        System.out.println("Digite as horas trabalhadas mensalmente pelo funcionario: ");
        horas = input.nextFloat();
        
        valorHora = (salario / horas);
        
        System.out.printf("O valor hora do funcionario e de: %.2f", valorHora);
        
        
        
    }
}
