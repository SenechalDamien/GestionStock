/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commun;

import java.io.Serializable;

/**
 *
 * @author Damien
 */
public class Stock implements Serializable{
    private int id;
    private String Reference;
    private String Famille;
    private float PrixUnitaire;
    private int NbEnStock;
    
    public Stock(int id, String Reference, String Famille, float PrixUnitaire, int NbEnStock) {
        this.id = id;
        this.Reference = Reference;
        this.Famille = Famille;
        this.PrixUnitaire = PrixUnitaire;
        this.NbEnStock = NbEnStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public String getFamille() {
        return Famille;
    }

    public void setFamille(String Famille) {
        this.Famille = Famille;
    }

    public float getPrixUnitaire() {
        return PrixUnitaire;
    }

    public void setPrixUnitaire(float PrixUnitaire) {
        this.PrixUnitaire = PrixUnitaire;
    }

    public int getNbEnStock() {
        return NbEnStock;
    }

    public void setNbEnStock(int NbEnStock) {
        this.NbEnStock = NbEnStock;
    }
    
    @Override
    public String toString()
    {
        return id + " " + Reference + " " + Famille + " " + PrixUnitaire + " " + NbEnStock;
    }
}
