/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientgestionstock;

import commun.Facture;
import commun.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class FactureTableModel extends AbstractTableModel{
    private List<Facture> factureList = new ArrayList<Facture>();
    private String[] entetes = {"Nom", "Adresse", "Total", "Mode de paiement"};

    public Facture getStockAt(int i){
        return factureList.get(i);
    }
    
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return getFactureList().size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0:
                return factureList.get(i).getNom();
            case 1:
                return factureList.get(i).getAdresse();
            case 2:
                return factureList.get(i).getTotal();
            case 3:
                return factureList.get(i).getModePaiment();
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    /**
     * @return the componentList
     */
    public List<Facture> getFactureList() {
        return factureList;
    }

    /**
     * @param componentList the componentList to set
     */
    public void setFactureList(List<Facture> componentList) {
        this.factureList = componentList;
        this.fireTableDataChanged();
    }
}
