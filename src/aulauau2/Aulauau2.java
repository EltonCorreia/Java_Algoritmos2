
package aulauau2;

import java.util.Scanner;

public class Aulauau2 {

    public static void main(String[] args) {
        
        double num;
        Scanner objS=new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        num = objS.nextDouble();
        
        if(num>0){
            
            System.out.println(num + " é positivo");
            
        }
        else if (num<0){
            
            System.out.println(num + " é negativo");
            
        }
        else{
            
            System.out.println(num + " é neutro");
            
        }
        
    }
    
}
