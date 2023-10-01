
package aulauau2;

import java.util.Scanner;

public class LarguraxComprimento {
    
    public static void main(String[] args) {
        
        double lar, com, area;
        
        Scanner ObjS = new Scanner(System.in);
        
        System.out.print("Digite a largura do lote: ");
        lar = ObjS.nextDouble();
        
        System.out.print("Digite a largura do comprimento: ");
        com = ObjS.nextDouble();
        
        area = (lar*com);
        
        System.out.print("A área total do lote é igual:" + area + " cm²");
        
    }
    
}
