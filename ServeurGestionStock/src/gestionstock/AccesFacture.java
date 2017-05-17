/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import commun.Facture;
import commun.AccesFactureInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damien
 */
public class AccesFacture extends UnicastRemoteObject implements AccesFactureInterface {

    public AccesFacture() throws RemoteException {
    }
    
    public List<Facture> findAll() {

        System.out.println("Facture.FindAll()...");
        List<Facture> result = new ArrayList<Facture>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM facture ;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Facture tempFacture = new Facture(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5));
                result.add(tempFacture);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public void PayerFacture(int idFacture, String modePaiment) {

        System.out.println("Facture.PayerFacture()...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "UPDATE facture SET ModePaiment='" + modePaiment + "' WHERE Reference='" + idFacture + "';";
            stmt.executeQuery(query);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
