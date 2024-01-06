/*Gerar um numero aleatório de 1 a 10 e pedir um chute ate que seja igual ao numero gerado no inicio
o programa deve informar se o chute foi acima ou abaixo do valor*/
package javaapplication1.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Chute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random random = new Random();
        
        int numAleatorio = random.nextInt(10);
        
        System.out.println("Digite um chute: ");
        int chute = input.nextInt();
        
        while(chute != numAleatorio){
       
        
        if(chute > numAleatorio){
            System.out.println("Errou! o numero e mais baixo! \n");
            System.out.println("Digite outro chute: ");
            chute = input.nextInt();
        }
        if(chute < numAleatorio){
            System.out.println("Errou! o numero e mais alto! \n");
            System.out.println("Digite outro chute: ");
            chute = input.nextInt();
        }
        
        }
        System.out.println("Voce acertou! parabens! o  numero foi: "+chute);
    }
}
