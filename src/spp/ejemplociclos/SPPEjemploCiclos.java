/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejemplociclos;

import java.util.Scanner;

/**
 *
 * @author falvizo
 */
public class SPPEjemploCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitaEntero("la edad");
        solicitaEntero ("el año");
        solicitaEntero ("el mes");
    }
    
    static int solicitaEntero (String mensaje){
        Scanner kb = new Scanner(System.in);
        int numero=0;
        boolean flag;
        do {
            System.out.println("Introduce " + mensaje);
            try {
                numero = kb.nextInt();
                flag = true;
            } catch (Exception ex) {
                flag=false;
                System.out.println("El número insertado no es entero " + ex);
                kb.nextLine();
            }     
        } while (flag == false);
        return numero;
    }
    
}
