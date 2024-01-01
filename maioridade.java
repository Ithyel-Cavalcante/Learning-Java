/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
vetor. Depois, mostrar na tela o nome da pessoa mais velha.*/
package javaapplication1.exercicios;

import java.util.Scanner;

public class maiorIdade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int qtdPessoas;
        
        System.out.println("Digite a quantidade de pessoas a serem digitadas: ");
        qtdPessoas = input.nextInt();
        
        
        int [] idades = new int[qtdPessoas];
        String [] nomes = new String[qtdPessoas];
        
           
        for(int i = 0; i < qtdPessoas; i++){
            System.out.println("Digite o nome da "+ (i+1)+" pessoa: ");
            nomes [i] = input.next();
            
            System.out.println("Digite sua idade: ");
            idades [i] = input.nextInt();
        }   
            int maiorIdade = idades [0];
            int maiorIndice = 0;
            
         for(int i = 0; i < qtdPessoas; i++){
               if(idades [i] > maiorIdade){
               maiorIdade = idades[i];
               maiorIndice = i;
               
               }
            }
         System.out.println("O mais velho e " +nomes[maiorIndice]+" com "+idades[maiorIndice]+" anos" );
         
        }
    }
