/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commun;

/**
 *
 * @author Damien
 */
import java.rmi.*;
import java.util.List;

public interface AccesFactureInterface extends Remote {

    public List<Facture> findAll() throws RemoteException;

    public void PayerFacture(int idFacture, String modePaiment) throws RemoteException;
}
