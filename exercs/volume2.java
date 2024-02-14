/*Fazer um programa que calcule o volume de treino 
semanal de cada grupo muscular e em seguida mostre o total*/
package coisas_uteis;

import java.util.Scanner;

public class volume2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int volumeTotal;
        int numMusculos = 7;
        int costas, biceps, peito, triceps, quadriceps, posterior, panturrilha;
        System.out.println("1: costas ");
        System.out.println("2: biceps ");
        System.out.println("3: peito ");
        System.out.println("4: triceps ");
        System.out.println("5: quadriceps ");
        System.out.println("6: posterior ");
        System.out.println("7: panturrilha ");
         
        int [] exercs = new int [numMusculos];
        
        for(int i = 0; i < numMusculos; i++){
            System.out.println("Digite a quantidade de exercicios para o musculo "+ (i+1)+" por dia");
            exercs [i] = input.nextInt();
            
        } 
        costas = (exercs[0] * 2) * 4;
        biceps = (exercs[1] * 2) * 4;
        peito = (exercs[2] * 2) * 4;
        triceps = (exercs[3] * 2) * 4;
        quadriceps = exercs[4] * 4;
        posterior = exercs[5] * 4;
        panturrilha = (exercs[6] * 2) * 4;
        
        volumeTotal = costas + biceps + peito + triceps + quadriceps + posterior + panturrilha;
        
        System.out.println("Seu volume semanal de costas e: "+(costas)+" series ");
        System.out.println("Seu volume semanal de biceps e: "+(biceps)+" series ");
        System.out.println("Seu volume semanal de peito e: "+(peito)+" series ");
        System.out.println("Seu volume semanal de triceps e: "+(triceps)+" series ");
        System.out.println("Seu volume semanal de quadriceps e: "+(quadriceps)+" series ");
        System.out.println("Seu volume semanal de posterior e: "+(posterior)+" series ");
        System.out.println("Seu volume semanal de panturrilha e: "+(panturrilha)+" series \n");
        System.out.println("Seu volume semanal total e: "+volumeTotal+" series ");
        
        
        
        
        
        
        
    }
}
