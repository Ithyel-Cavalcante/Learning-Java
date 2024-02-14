//Informar um saldo e imprimir o saldo com reajuste de 1%.

package javaapplication1.exercicios;

import java.util.Scanner;

public class Exercicio3pdf {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
    double saldo, saldoReajustado, reajuste;
    
        System.out.println("Digite seu saldo: ");
        saldo = input.nextDouble();
    
        reajuste = saldo/100;
        
        saldoReajustado = saldo + reajuste;
        
        System.out.println("Seu saldo reajustado e: "+ saldoReajustado );
    
    }
    
}
