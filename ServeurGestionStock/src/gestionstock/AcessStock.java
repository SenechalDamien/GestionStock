/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import commun.AccesStockInterface;
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
public class AcessStock extends UnicastRemoteObject implements AccesStockInterface {

    public AcessStock() throws RemoteException {
    }

    public List<commun.Stock> findAll() {

        System.out.println("Composant.FindAll()...");
        List<commun.Stock> result = new ArrayList<commun.Stock>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM composant ;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                commun.Stock tempFacture = new commun.Stock(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5));
                result.add(tempFacture);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public List<commun.Stock> findAllByReference(String Reference) {

        System.out.println("Composant.findAllByReference()...");
        List<commun.Stock> result = new ArrayList<commun.Stock>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM composant WHERE Reference LIKE '%" + Reference + "%';";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                commun.Stock tempFacture = new commun.Stock(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5));
                result.add(tempFacture);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public List<commun.Stock> findAllByFamille(String Famille) {

        System.out.println("Composant.findAllByFamille()...");
        List<commun.Stock> result = new ArrayList<commun.Stock>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM composant WHERE Famille LIKE '%" + Famille + "%';";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                commun.Stock tempFacture = new commun.Stock(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getInt(5));
                result.add(tempFacture);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public void modifierNbComposantId(int NewNbComposant, int IdComposant) {

        System.out.println("Composant.modifierNbComposantId()...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "UPDATE composant SET NbEnStok='" + NewNbComposant + "' WHERE Id='" + IdComposant + "';";
            stmt.executeQuery(query);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modifierNbComposantReference(int NewNbComposant, String Reference) {

        System.out.println("Composant.modifierNbComposantId()...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stock";
            String username = "root";
            String password = "";

            System.out.println("Connecting database...");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
            Statement stmt = connection.createStatement();
            String query = "UPDATE composant SET NbEnStok='" + NewNbComposant + "' WHERE Reference='" + Reference + "';";
            stmt.executeQuery(query);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        } catch (Exception ex) {
            Logger.getLogger(AccesFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
