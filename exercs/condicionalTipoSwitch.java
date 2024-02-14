/*Condicional do tipo Switch*/
import java.util.Scanner;

public class aula10 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pernas: ");
        int pernas = input.nextInt();
        
        String tipo;
        
        switch(pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6,8:
                tipo = "aranha";
                break;
            default:
                tipo = "Alien";
    }
        System.out.println("isso e um(a) "+tipo);
    }
}
