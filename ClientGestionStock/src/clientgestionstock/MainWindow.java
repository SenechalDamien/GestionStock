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
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import commun.AccesStockInterface;
import commun.Facture;
import commun.Stock;
import java.util.HashMap;
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
    private List<Facture> currentFactureList;
    float currentTotalFacture = 0;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        try {
            Remote r = Naming.lookup("rmi://localhost/AccesStock");
            System.out.println(r);
            if(r instanceof AccesStockInterface) {
                stockInterface = (AccesStockInterface) r;
                List<Stock> s = ((AccesStockInterface) r).findAll();
                System.out.println(s.isEmpty());
                fillStockDisplay(s);

            }
                
            Remote r2 = Naming.lookup("rmi://localhost/AccesFacture");
            System.out.println(r2);
            if (r2 instanceof AccesFactureInterface) {
                factureInterface = (AccesFactureInterface) r2;
                List<Facture> s = ((AccesFactureInterface) r2).findAll();
                System.out.println(s.isEmpty());
                fillFactureDisplay(s);
            }
                
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e){
            e.printStackTrace();
        }
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        NombreAjout = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NomFacture = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AdresseFacture = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ValiderFacture = new javax.swing.JButton();
        AnnulerFacture = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NomModePaiement = new javax.swing.JTextField();
        PaiementFacture = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        ErreurFacture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rechercher un composant :");

        NomFamille.setText("famille");

        NombreAchat.setText("Nombre");

        AchatComposant.setText("Acheter");
        AchatComposant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AchatComposantActionPerformed(evt);
            }
        });

        jLabel2.setText("Error");

        jLabel3.setText("Ajouter des produits :");

        AjoutProduit.setText("Valider");
        AjoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutProduitActionPerformed(evt);
            }
        });

        numReference.setText("Référence");

        RechercheComposant.setText("Valider");
        RechercheComposant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheComposantActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        NombreAjout.setText("Nombre");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NomFamille, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numReference, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RechercheComposant))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NombreAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AchatComposant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdresseFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AnnulerFacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ValiderFacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(NombreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AjoutProduit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(NomFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomFamille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RechercheComposant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AchatComposant)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(AdresseFacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValiderFacture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AnnulerFacture))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        NomFamille.getAccessibleContext().setAccessibleName("Famille");
        NombreAchat.getAccessibleContext().setAccessibleName("NombreAchat");
        jLabel2.getAccessibleContext().setAccessibleName("ErrorText");
        jLabel3.getAccessibleContext().setAccessibleName("");
        AjoutProduit.getAccessibleContext().setAccessibleName("ValidationAjout");
        numReference.getAccessibleContext().setAccessibleName("Reference");
        RechercheComposant.getAccessibleContext().setAccessibleName("ValiderRecherche");

        jTabbedPane1.addTab("Composants", jPanel1);

        NomModePaiement.setText("Mode de paiement");

        PaiementFacture.setText("Paiement");
        PaiementFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaiementFactureActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NomModePaiement, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaiementFacture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErreurFacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomModePaiement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaiementFacture)
                    .addComponent(ErreurFacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(209, 209, 209))
        );

        NomModePaiement.getAccessibleContext().setAccessibleName("ModePaiement");
        PaiementFacture.getAccessibleContext().setAccessibleName("Payer");

        jTabbedPane1.addTab("Facture", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechercheComposantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheComposantActionPerformed
        String famille = NomFamille.getText();
        String reference = numReference.getText();
        if(!famille.isEmpty()){
            try {
                List<Stock> stockFam = stockInterface.findAllByFamille(famille);
                fillStockDisplay(stockFam);
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        if(!reference.isEmpty()){
            try {
                List<Stock> stockFam = stockInterface.findAllByReference(reference);
                fillStockDisplay(stockFam);
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
    }//GEN-LAST:event_RechercheComposantActionPerformed

    private void AchatComposantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AchatComposantActionPerformed
        //A modifier pour supporter l'edition de factures
        //Retirer les produits de la base de donnée uniquement une fois la facture validée 
        //(modifier la liste et l'affichage pendant l'édition, faire les changement en base à la validation (reporter le contenu de la liste)
        //avec création facture et rafraichissement de la liste des factures
        int nombre = Integer.valueOf(NombreAchat.getText());
        int index = jList1.getSelectedIndex();
        if(index == -1){
            jLabel2.setText("Pas de composant sélectionné");
            return;
        }
        Stock stock = currentComponentList.get(jList1.getSelectedIndex());
        if(stock.getNbEnStock() - nombre > 0){
            stock.setNbEnStock(stock.getNbEnStock() - nombre);
            currentTotalFacture += stock.getPrixUnitaire() * nombre;
            jLabel7.setText(Float.toString(currentTotalFacture));
        } else {
            jLabel2.setText("Stock insuffisant");
            return;
        }
        /*try {
            stockInterface.modifierNbComposantId(stock.getNbEnStock(), stock.getId());
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        refreshStockDisplay();
    }//GEN-LAST:event_AchatComposantActionPerformed

    private void AjoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutProduitActionPerformed
        int nombre = Integer.valueOf(NombreAjout.getText());
        int index = jList1.getSelectedIndex();
        if(index == -1){
            jLabel2.setText("Pas de composant sélectionné");
            return;
        }
        Stock stock = currentComponentList.get(jList1.getSelectedIndex());
        try {
            stockInterface.modifierNbComposantReference(stock.getNbEnStock() + nombre, stock.getReference());
            stock.setNbEnStock(stock.getNbEnStock() + nombre);
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshStockDisplay();
    }//GEN-LAST:event_AjoutProduitActionPerformed

    private void ValiderFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderFactureActionPerformed
        // TODO add your handling code here:
        if(NomFacture.getText().isEmpty() || AdresseFacture.getText().isEmpty()){
            jLabel2.setText("Les champs obligatoire ne sont pas remplis");
            return;
        }
            
        Stock stock;
        for (int i = 0; i < currentComponentList.size(); i++) {
            stock = currentComponentList.get(i);
            try {
                stockInterface.modifierNbComposantId(stock.getNbEnStock(), stock.getId());
            } catch (RemoteException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            factureInterface.AddFacture(NomFacture.getText(), AdresseFacture.getText(), currentTotalFacture);
            currentTotalFacture = 0;
            jLabel7.setText(Float.toString(currentTotalFacture));
            List<Facture> s = factureInterface.findAll();
            fillFactureDisplay(s);
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ValiderFactureActionPerformed

    private void AnnulerFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerFactureActionPerformed
        try {
            // Recharge les données de la base
            List<Stock> s = stockInterface.findAll();
            fillStockDisplay(s);
        } catch (RemoteException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        // total a 0
        currentTotalFacture = 0;
        jLabel7.setText(Float.toString(currentTotalFacture));
    }//GEN-LAST:event_AnnulerFactureActionPerformed

    private void PaiementFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaiementFactureActionPerformed
        String payment = NomModePaiement.getText();
        int index = jList2.getSelectedIndex();
        /*if(index == -1){
            jLabel2.setText("Pas de composant sélectionné");
            return;
        }*/
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
        currentComponentList = s;
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < s.size(); i++) {
            model.addElement(s.get(i).toString());
            System.out.println(s.get(i).toString());
        }
        jList1.setModel(model);
    }
    
    private void fillFactureDisplay(List<Facture> f)
    {
        currentFactureList = f;
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < f.size(); i++) {
            model.addElement(f.get(i).toString());
            System.out.println(f.get(i).toString());
        }
        jList2.setModel(model);
    }
    
    private void refreshStockDisplay()
    {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < currentComponentList.size(); i++) {
            model.addElement(currentComponentList.get(i).toString());
            System.out.println(currentComponentList.get(i).toString());
        }
        jList1.setModel(model);
    }
    
    private void refreshFactureDisplay()
    {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < currentFactureList.size(); i++) {
            model.addElement(currentFactureList.get(i).toString());
            System.out.println(currentFactureList.get(i).toString());
        }
        jList2.setModel(model);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField numReference;
    // End of variables declaration//GEN-END:variables
}
