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

public interface AccesStockInterface extends Remote {

    public List<Stock> findAll() throws RemoteException;

    public List<Stock> findAllByReference(String Reference) throws RemoteException;

    public List<Stock> findAllByFamille(String Famille) throws RemoteException;

    public void modifierNbComposantId(int NewNbComposant, int IdComposant) throws RemoteException;

    public void modifierNbComposantReference(int NewNbComposant, String Reference) throws RemoteException;
}
