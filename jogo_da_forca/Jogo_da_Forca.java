// Nome: Yago Vinicius Ferreira de Castro
//Nro de matricula: 11721BCC020

// Nome: Luis Gabriel Maximo
//Nro de matricula: 11721BCC027


package jogo_da_forca;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo_da_Forca {
    
    static public void adivinhe(String palavra, int vida)
    {
        char[] esp = new char[palavra.length()];
        int i = 0;
        int j = 0;
        
        
        imagem_forca(vida);
        while(i < palavra.length()){
            esp[i] = '-';
                if(palavra.charAt(i) == ' '){
                    esp[i] = ' ';
                }
            i++;
        }
            System.out.println(esp); 
            
            Scanner sc1 = new Scanner(System.in);
            
            ArrayList<Character> l = new ArrayList <Character>(); 
            
            while(vida > 0){
                System.out.printf("Insira a letra: ");
                char x = sc1.next().charAt(0);
                System.out.println("\n");
                
                if(l.contains(x)){
                    System.out.println("Ja foi inserido!");
                    continue;
                }
                
                l.add(x);
                
                    if(palavra.contains(x+"")){
                        for(j = 0; j < palavra.length(); j++){
                            if(palavra.charAt(j) == x){
                                esp[j] = x;
                                imagem_forca(vida);
                            }
                        }
                    }
                    else{
                        vida--;
                        imagem_forca(vida);
                    }
               if(palavra.equals(String.valueOf(esp))){
                   System.out.println(esp);
                   System.out.println("Parabéns, você venceu!");
                   break;
               }
                    
            System.out.println(esp);
            System.out.println("" );
            }
            if(vida == 0){
                System.out.println("Você foi enforcado!");
                imagem_forca(vida);
            }       
    }
    
    public static void imagem_forca(int vida){
                 if (vida == 6) {
			System.out.println("   ____________");
			System.out.println("   |           | ");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
                if (vida == 5) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\ ");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (vida == 4) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
                        System.out.println("   |           |  ");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (vida == 3) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
                        System.out.println("   |           |  ");
			System.out.println("   |          / ");
			System.out.println("___|___      /   ");
		}
		if (vida == 2) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     | ");
			System.out.println("   |         \\_ _/ ");
			System.out.println("   |           |  ");
			System.out.println("   |           |  ");
                        System.out.println("   |           |  ");
			System.out.println("   |          / \\  ");
			System.out.println("___|___      /   \\ ");
			System.out.println();
		}
                if (vida == 1) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     | ");
			System.out.println("   |         \\_ _/ ");
			System.out.println("   |           |__  ");
			System.out.println("   |           |  \\  ");
                        System.out.println("   |           |   \\    ");
			System.out.println("   |          / \\   ");
			System.out.println("___|___      /   \\  ");
			System.out.println();
                }
                if (vida == 0) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_ ");
			System.out.println("   |         /   \\ ");
			System.out.println("   |        |     |  ");
			System.out.println("   |         \\_ _/   ");
			System.out.println("   |         __|__  ");
			System.out.println("   |        /  |  \\  ");
                        System.out.println("   |       /   |   \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\  ");
			System.out.println();
		}
	}
    
    public static void main(String[] args){
        int vida = 6;
        String  palavra = "Buceta";
       
        adivinhe(palavra, vida);          
    }
    
}
