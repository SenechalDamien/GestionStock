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
        String ip = "";
        String port = "";
        if(args.length > 1){
            ip = args[0];
            System.out.println(ip);
            port = args[1];
            System.out.println(port);

        }
        if(port.isEmpty())
            port = "1099";
        if(ip.isEmpty())
            ip = "localhost";
        try { 
            //1099
            java.rmi.registry.LocateRegistry.createRegistry(Integer.parseInt(port));
            System.out.println("RMI registry ready.");
        } catch (Exception e) {
            System.out.println("Exception starting RMI registry:");
            e.printStackTrace();
        }

        try {
            AccesFacture accesFacture = new AccesFacture();
            Naming.rebind("rmi://"+ip+"/AccesFacture", accesFacture);
            
            AcessStock accesStock = new AcessStock();
            Naming.rebind("rmi://"+ip+"/AccesStock", accesStock);

            System.out.println("GestionStock Server is ready.");
        } catch (Exception e) {
            System.out.println("GestionStock Server failed: " + e);
        }
    }

}
