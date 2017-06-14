/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientgestionstock;

import commun.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class ComponentTableModel extends AbstractTableModel{
    private List<Stock> componentList = new ArrayList<Stock>();
    private String[] entetes = {"Référence", "Famille", "Prix unitaire", "Stock"};

    public void addStock(Stock stock) {
        getComponentList().add(stock);
    }
    
    public Stock getStockAt(int i){
        return componentList.get(i);
    }
    
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return getComponentList().size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0:
                return componentList.get(i).getReference();
            case 1:
                return componentList.get(i).getFamille();
            case 2:
                return componentList.get(i).getPrixUnitaire();
            case 3:
                return componentList.get(i).getNbEnStock();
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    /**
     * @return the componentList
     */
    public List<Stock> getComponentList() {
        return componentList;
    }

    /**
     * @param componentList the componentList to set
     */
    public void setComponentList(List<Stock> componentList) {
        this.componentList = componentList;
        this.fireTableDataChanged();
    }
    
}
