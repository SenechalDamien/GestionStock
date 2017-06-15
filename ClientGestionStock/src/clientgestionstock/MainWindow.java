/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientgestionstock;

import commun.AccesFactureInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import commun.AccesStockInterface;
import commun.Facture;
import commun.Stock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class MainWindow extends javax.swing.JFrame {

    private AccesStockInterface stockInterface;
    private AccesFactureInterface factureInterface;
    private List<Stock> currentComponentList;
    private Map<Stock, Integer> productsInTheCurrentFacture;
    private List<Facture> currentFactureList;
    private ComponentTableModel componentTableModel;
    private FactureTableModel factureTableModel;
    float currentTotalFacture = 0;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        productsInTheCurrentFacture = new HashMap<Stock, Integer>();
        this.componentTableModel = new ComponentTableModel();
        factureTableModel = new FactureTableModel();
        initComponents();
        try {
            Remote r = Naming.lookup("rmi://localhost/AccesStock");
            System.out.println(r);
            if(r instanceof AccesStockInterface) {
                stockInterface = (AccesStockInterface) r;
                currentComponentList = ((AccesStockInterface) r).findAll();
                System.out.println(currentComponentList.isEmpty());
                fillStockDisplay(currentComponentList);

            }
                
            Remote r2 = Naming.lookup("rmi://localhost/AccesFacture");
            System.out.println(r2);
            if (r2 instanceof AccesFactureInterface) {
                factureInterface = (AccesFactureInterface) r2;
                currentFactureList = ((AccesFactureInterface) r2).findAll();
                System.out.println(currentFactureList.isEmpty());
                fillFactureDisplay(currentFactureList);
            }
                
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e){
            e.printStackTrace();
        }
        componentTableModel.setComponentList(currentComponentList);
        jTable1.setModel(componentTableModel);
        
        factureTableModel.setFactureList(currentFactureList);
        jTable2.setModel(factureTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        NomModePaiement = new javax.swing.JTextField();
        PaiementFacture = new javax.swing.JButton();
        ErreurFacture = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NomFamille = new javax.swing.JTextField();
        NombreAchat = new javax.swing.JTextField();
        AchatComposant = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AjoutProduit = new javax.swing.JToggleButton();
        numReference = new javax.swing.JTextField();
        RechercheComposant = new javax.swing.JButton();
        NombreAjout = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NomFacture = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AdresseFacture = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ValiderFacture = new javax.swing.JButton();
        AnnulerFacture = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaiementFacture.setText("Paiement");
        PaiementFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaiementFactureActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setText("Mode de paiement :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NomModePaiement, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PaiementFacture)
                        .addGap(414, 414, 414)
                        .addComponent(ErreurFacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NomModePaiement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PaiementFacture)
                        .addComponent(jLabel8))
                    .addComponent(ErreurFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(361, Short.MAX_VALUE))
        );

        NomModePaiement.getAccessibleContext().setAccessibleName("ModePaiement");
        PaiementFacture.getAccessibleContext().setAccessibleName("Payer");

        jTabbedPane1.addTab("Facture", jPanel2);

        jLabel1.setText("Rechercher un composant :");

        AchatComposant.setText("Acheter");
        AchatComposant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AchatComposantActionPerformed(evt);
            }
        });

        jLabel3.setText("Ajouter des produits :");

        AjoutProduit.setText("Valider");
        AjoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutProduitActionPerformed(evt);
            }
        });

        RechercheComposant.setText("Valider la recherche");
        RechercheComposant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheComposantActionPerformed(evt);
            }
        });

        NombreAjout.setToolTipText("");

        jLabel4.setText("Nom :");

        jLabel5.setText("Adresse :");

        jLabel6.setText("Total : ");

        ValiderFacture.setText("Valider Facture");
        ValiderFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderFactureActionPerformed(evt);
            }
        });

        AnnulerFacture.setText("Annuler Facture");
        AnnulerFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerFactureActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setText("Par famille :");

        jLabel10.setText("Par référence :");

        jLabel11.setText("Acheter des produits :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NombreAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AchatComposant))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AdresseFacture))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NomFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(8, 8, 8)
                                            .addComponent(NombreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AjoutProduit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AnnulerFacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ValiderFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(430, 430, 430)))
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NomFamille, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(numReference))
                        .addGap(106, 106, 106)
                        .addComponent(RechercheComposant))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(NomFamille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(numReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(RechercheComposant)
                        .addGap(19, 19, 19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AchatComposant))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(AjoutProduit)
                            .addComponent(NombreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NomFacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(AdresseFacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ValiderFacture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnnulerFacture)))
                .addGap(32, 32, 32))
        );

        NomFamille.getAccessibleContext().setAccessibleName("Famille");
        NombreAchat.getAccessibleContext().setAccessibleName("NombreAchat");
        jLabel2.getAccessibleContext().setAccessibleName("ErrorText");
        jLabel3.getAccessibleContext().setAccessibleName("");
        AjoutProduit.getAccessibleContext().setAccessibleName("ValidationAjout");
        numReference.getAccessibleContext().setAccessibleName("Reference");
        RechercheComposant.getAccessibleContext().setAccessibleName("ValiderRecherche");

        jTabbedPane1.addTab("Composants", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechercheComposantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheComposantActionPerformed
        String famille = NomFamille.getText();
        String reference = numReference.getText();
        if(!famille.isEmpty()){
            try {
                currentComponentList = stockInterface.findAllByFamille(famille);
                refreshStockDisplay();
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        if(!reference.isEmpty()){
            try {
                currentComponentList = stockInterface.findAllByReference(reference);
                refreshStockDisplay();
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
    }//GEN-LAST:event_RechercheComposantActionPerformed

    private void AchatComposantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AchatComposantActionPerformed
        int nombre = 0;
        try {
        nombre = Integer.valueOf(NombreAchat.getText());
        } catch (NumberFormatException e){
            jLabel2.setText("Le nombre saisi n'est pas valide");
            return;
        }
        int index = jTable1.getSelectedRow();
        if(index == -1){
            jLabel2.setText("Pas de composant sélectionné");
            return;
        }
                
        Stock stock = currentComponentList.get(index);
        if(stock.getNbEnStock() - nombre > 0){
            //mise à jour du nb de composants dans la liste et dans la bdd
            try {
                if(stockInterface.ajouterComposantsId(-nombre, stock.getId())){
                    stock.setNbEnStock(stock.getNbEnStock() - nombre);
                    refreshStockDisplay();
                }
                else{
                    jLabel2.setText("Nombre de composants incorrect");
                    return;
                }
                    
                //stockInterface.modifierNbComposantId(stock.getNbEnStock(), stock.getId());
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                jLabel2.setText("Impossible d'accéder à la base de donnée");
                return;
            }
            Integer value = productsInTheCurrentFacture.put(stock, nombre);
            //cas où un nombre de ce composant à déjà été ajouté
            if(value  != null)
                productsInTheCurrentFacture.put(stock, value + nombre);
            currentTotalFacture += stock.getPrixUnitaire() * nombre;
            jLabel7.setText(Float.toString(currentTotalFacture));
        } else {
            jLabel2.setText("Stock insuffisant");
            return;
        }
    }//GEN-LAST:event_AchatComposantActionPerformed

    private void AjoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutProduitActionPerformed
        int nombre;
        try {
        nombre = Integer.valueOf(NombreAjout.getText());
        } catch (NumberFormatException e){
            jLabel2.setText("Le nombre saisi n'est pas valide");
            return;
        }
        //int index = jList1.getSelectedIndex();
        int index = jTable1.getSelectedRow();
        if(index == -1){
            jLabel2.setText("Pas de composant sélectionné");
            return;
        }

        //Ajout des produits
        Stock stock = currentComponentList.get(index);
        try {
            if(stockInterface.ajouterComposantsId(nombre, stock.getId())){
                stock.setNbEnStock(stock.getNbEnStock() + nombre);
                refreshStockDisplay();
            }
            else {
                jLabel2.setText("Nombre de composants incorrect");
                return;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AjoutProduitActionPerformed

    private void ValiderFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderFactureActionPerformed
        // TODO add your handling code here:
        if(NomFacture.getText().isEmpty() || AdresseFacture.getText().isEmpty()){
            jLabel2.setText("Les champs obligatoire ne sont pas remplis");
            return;
        }
       
        try {
            factureInterface.AddFacture(NomFacture.getText(), AdresseFacture.getText(), currentTotalFacture);
            currentTotalFacture = 0;
            jLabel7.setText(Float.toString(currentTotalFacture));
            currentFactureList = factureInterface.findAll();
            fillFactureDisplay(currentFactureList);
            currentComponentList = stockInterface.findAll();
            refreshStockDisplay();
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        productsInTheCurrentFacture.clear();
    }//GEN-LAST:event_ValiderFactureActionPerformed

    private void AnnulerFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerFactureActionPerformed
        
        Iterator i = productsInTheCurrentFacture.keySet().iterator();
        Stock stock;
        Integer nombre;
        while(i.hasNext()){
            stock = (Stock)i.next();
            nombre = (Integer) productsInTheCurrentFacture.get(stock);
            try {
                stockInterface.ajouterComposantsId(nombre, stock.getId());
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            // Recharge les données de la base
            currentComponentList = stockInterface.findAll();
            refreshStockDisplay();
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        // total a 0
        currentTotalFacture = 0;
        jLabel7.setText(Float.toString(currentTotalFacture));
    }//GEN-LAST:event_AnnulerFactureActionPerformed

    private void PaiementFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaiementFactureActionPerformed
        String payment = NomModePaiement.getText();
        //int index = jList2.getSelectedIndex();
        int index = jTable2.getSelectedRow();
        if(index == -1){
            ErreurFacture.setText("Pas de facture sélectionnée");
            return;
        }
        Facture stock = currentFactureList.get(index);
        stock.setModePaiment(payment);
        try {
            factureInterface.PayerFacture(stock.getId(), payment);
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshFactureDisplay();
    }//GEN-LAST:event_PaiementFactureActionPerformed
    
    private void fillStockDisplay(List<Stock> s)
    {
        componentTableModel.setComponentList(currentComponentList);
    }
    
    private void fillFactureDisplay(List<Facture> f)
    {
        factureTableModel.setFactureList(currentFactureList);
    }
    
    private void refreshStockDisplay()
    {
        componentTableModel.setComponentList(currentComponentList);
    }
    
    private void refreshFactureDisplay()
    {
        factureTableModel.setFactureList(currentFactureList);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AchatComposant;
    private javax.swing.JTextField AdresseFacture;
    private javax.swing.JToggleButton AjoutProduit;
    private javax.swing.JButton AnnulerFacture;
    private javax.swing.JLabel ErreurFacture;
    private javax.swing.JTextField NomFacture;
    private javax.swing.JTextField NomFamille;
    private javax.swing.JTextField NomModePaiement;
    private javax.swing.JTextField NombreAchat;
    private javax.swing.JTextField NombreAjout;
    private javax.swing.JButton PaiementFacture;
    private javax.swing.JButton RechercheComposant;
    private javax.swing.JButton ValiderFacture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField numReference;
    // End of variables declaration//GEN-END:variables
}
