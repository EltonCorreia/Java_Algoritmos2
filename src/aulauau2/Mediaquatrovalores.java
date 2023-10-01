
package aulauau2;

import java.util.Scanner;

public class Mediaquatrovalores {
    
    public static void main(String[] args) {
    
    Double num1, num2, num3, num4, media;
    
    Scanner ObjS = new Scanner(System.in);
    System.out.print("Digite um número: ");
    num1 = ObjS.nextDouble();
    
    System.out.print("Digite outro número: ");
    num2 = ObjS.nextDouble();
    
    System.out.print("Digite outro número: ");
    num3 = ObjS.nextDouble();
    
    System.out.print("Digite outro número: ");
    num4 = ObjS.nextDouble();
    
    media = (num1 + num2 + num3 + num4)/4;
    
   System.out.print(media + " é média entre os valores." );
    
    }
    
}
