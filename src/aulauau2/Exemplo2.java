
package aulauau2;

import java.util.Scanner;

public class Exemplo2 {
    
    public static void main(String[] args) {
    
        Double num1, num2, media;
        String nome;
        Scanner sc1 = new Scanner(System.in, "latin1");
        
        System.out.print("Digite seu nome: ");
        nome = sc1.next();
        
        System.out.print("Digite um número: ");
        num1 = sc1.nextDouble();
    
        System.out.print("Digite um número: ");
        num2 = sc1.nextDouble();
        
        media = (num1 + num2)/2;
        
        if (media >=7){
            
            System.out.println(nome + " foi aprovado!");
            
        }
        else if (media <=5){
            
            System.out.println(nome + " foi reprovado!");
            
        }
        else{
            
            System.out.println(nome + " está em recuperação!");
            
        }
        
    }
 
}
