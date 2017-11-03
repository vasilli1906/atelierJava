/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.main;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class PointEntree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long a = 10, b = 20;
        long c = a;
        a = b;
        b = c;
        
        System.out.println(a + " " + b);
        
//        long a = 10, b = 20, c = 30;
//        long d = a + b + c;
//        
//        System.out.println(d);
        
//        String monLogin, motDePasse;
//        Scanner scanner = new Scanner(System.in);
//                
//        System.out.print("Votre identifiant : ");
//        monLogin = scanner.nextLine();
//        
//        System.out.print("Votre mot de passe : ");
//        motDePasse = scanner.nextLine();
//        
//        System.out.println(monLogin);
//        System.out.println(motDePasse);
    }
    
}
