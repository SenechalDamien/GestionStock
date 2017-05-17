/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import java.io.Serializable;

/**
 *
 * @author Damien
 */
public class Facture implements Serializable{
    private int Id;
    private String Nom;
    private String Adresse;
    private float Total;
    private String ModePaiment;

    public Facture(int Id, String Nom, String Adresse, float Total, String ModePaiment) {
        this.Id = Id;
        this.Nom = Nom;
        this.Adresse = Adresse;
        this.Total = Total;
        this.ModePaiment = ModePaiment;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public String getModePaiment() {
        return ModePaiment;
    }

    public void setModePaiment(String ModePaiment) {
        this.ModePaiment = ModePaiment;
    }
    
}
