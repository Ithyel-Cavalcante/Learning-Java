package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: \n");
        int nota1 = input.nextInt();
        
        System.out.println("Digite a segunda nota: \n");
        int nota2 = input.nextInt();
        
        int media = (nota1 + nota2)/2;
        
        System.out.println("Sua media e: " + media);
            
            if(media < 6){
                System.out.println("Voce nao passou :(");
            }
            if(media >= 6){
                System.out.println("Voce passou! :)");
            }
        
        
       
    }
    }
