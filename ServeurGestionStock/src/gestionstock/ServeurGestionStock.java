/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import commun.Facture;
import commun.Stock;
import java.rmi.Naming;
import java.util.List;

/**
 *
 * @author Damien
 */
public class ServeurGestionStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry ready.");
        } catch (Exception e) {
            System.out.println("Exception starting RMI registry:");
            e.printStackTrace();
        }

        try {
            AccesFacture accesFacture = new AccesFacture();
            Naming.rebind("rmi://localhost/AccesFacture", accesFacture);
            
            AcessStock accesStock = new AcessStock();
            Naming.rebind("rmi://localhost/AccesStock", accesStock);

            System.out.println("Addition Server is ready.");
        } catch (Exception e) {
            System.out.println("Addition Server failed: " + e);
        }
    }

}
