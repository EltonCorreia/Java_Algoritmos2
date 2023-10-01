
package aulauau2;

import java.util.Scanner;

public class Piscina {
    
    public static void main(String[] args) {
    
        double com, lar, pro, val;
        
        Scanner ObjS = new Scanner(System.in);
        System.out.print("Digite o comprimento da piscina: ");
        com = ObjS.nextDouble();
        
        System.out.print("Digite a largura da piscina: ");
        lar = ObjS.nextDouble();
        
        System.out.print("Digite a profundidade da piscina: ");
        pro = ObjS.nextDouble();
        
        val = (com*lar*pro*45);
    
        System.out.print("O valor da construção é igual a " + val + "cm³");
        
    }
    
}
