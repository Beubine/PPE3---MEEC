/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialoguer;

import controle.Modele.ModelePosition;
import entite.Allee;
import entite.Quai;
import entite.Emplacement;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 *
 * @author Packard Bell
 */
public class FenAjoutElements extends javax.swing.JFrame {
    
    // Création de deux modèles (vide, plein)
    
    private ModelePosition unModelePositionVide;
    private ModelePosition unModelePositionPlein;
    
    
    /**
     * Creates new form FenAjoutElements
     */
    
    private void complementGUI(){
        //Affiche le logo
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo/Tholdisimplepetit.png")));
        //Affiche le nom
     setTitle("MEEC");
    }
    
    
    public FenAjoutElements() {
        initComponents();
        listeQuai();
        complementGUI();
        
    }
    
    private void listeQuai(){
        int i;
        Quai unQuai = new Quai();
        jComboQuai.removeAllItems();
        jComboQuai.addItem("");
        for(i=0;i<unQuai.getLesEnrg().size();i++){
            
        jComboQuai.addItem(unQuai.getLesEnrg().get(i).getNumQuai());
    }
        
    }
    
    private void listeAllee(String unQuai){
        int i;
        Allee uneAllee = new Allee(unQuai);
        jComboAllee.removeAllItems();
        jComboAllee.addItem("");
        for(i=0;i<uneAllee.getLesEnrg().size();i++){
            jComboAllee.addItem(uneAllee.getLesEnrg().get(i).getNumAllee());
        
    }
        
    }
    
     private void listeEmplacement(String unQuai, String uneAllee){
        int i;
        Emplacement unEmplacement = new Emplacement(unQuai, uneAllee);
        jComboEmplacement.removeAllItems();
        jComboEmplacement.addItem("");
        for(i=0;i<unEmplacement.getLesEnrg().size();i++){
            jComboEmplacement.addItem(unEmplacement.getLesEnrg().get(i).getNumemplacement());
        
    }
        
      
     }
     private void videEmplacement(){
         jComboEmplacement.removeAllItems();
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButtonAjoutQuai = new javax.swing.JButton();
        jButtonSupprimerQuai = new javax.swing.JButton();
        jButtonAjoutAllee = new javax.swing.JButton();
        jButtonSupprimerAllee = new javax.swing.JButton();
        jButtonAjoutEmplacement = new javax.swing.JButton();
        jButtonSupprimerEmplacement = new javax.swing.JButton();
        jTextQuai = new javax.swing.JTextField();
        jTextAllee = new javax.swing.JTextField();
        jTextEmplacement = new javax.swing.JTextField();
        jComboQuai = new javax.swing.JComboBox<>();
        jComboAllee = new javax.swing.JComboBox<>();
        jComboEmplacement = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonQuitter = new javax.swing.JButton();
        jButtonRetour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlein = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVide = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAjoutQuai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAjoutQuai.setText("Créer Quai");
        jButtonAjoutQuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutQuaiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAjoutQuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 190, -1));

        jButtonSupprimerQuai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSupprimerQuai.setText("Supprimer Quai");
        jButtonSupprimerQuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerQuaiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSupprimerQuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 190, -1));

        jButtonAjoutAllee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAjoutAllee.setText("Créer Allée");
        jButtonAjoutAllee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutAlleeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAjoutAllee, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 190, -1));

        jButtonSupprimerAllee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSupprimerAllee.setText("Supprimer Allée");
        jButtonSupprimerAllee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerAlleeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSupprimerAllee, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 190, -1));

        jButtonAjoutEmplacement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAjoutEmplacement.setText("Créer Emplacement");
        jButtonAjoutEmplacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutEmplacementActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAjoutEmplacement, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 190, -1));

        jButtonSupprimerEmplacement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSupprimerEmplacement.setText("Supprimer Emplacement");
        jButtonSupprimerEmplacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerEmplacementActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSupprimerEmplacement, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 190, -1));
        getContentPane().add(jTextQuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 150, 30));
        getContentPane().add(jTextAllee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, 30));
        getContentPane().add(jTextEmplacement, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 150, 30));

        jComboQuai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboQuaiItemStateChanged(evt);
            }
        });
        jComboQuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboQuaiActionPerformed(evt);
            }
        });
        getContentPane().add(jComboQuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 150, 30));

        jComboAllee.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboAlleeItemStateChanged(evt);
            }
        });
        jComboAllee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAlleeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboAllee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 150, 30));

        jComboEmplacement.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboEmplacementItemStateChanged(evt);
            }
        });
        jComboEmplacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEmplacementActionPerformed(evt);
            }
        });
        getContentPane().add(jComboEmplacement, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 150, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 480, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 480, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Quai");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Allée");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("étage occupé");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Emplacement");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MEEC");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("étage vide");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jButtonQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/quitter1.png"))); // NOI18N
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQuitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, 60));

        jButtonRetour.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRetour.setText("Retour");
        jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 90, 60));

        jScrollPane1.setViewportView(jTablePlein);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, 150));

        jScrollPane2.setViewportView(jTableVide);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 240, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fond/fond.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboEmplacementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEmplacementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEmplacementActionPerformed

    private void jComboQuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboQuaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboQuaiActionPerformed

    private void jButtonAjoutQuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutQuaiActionPerformed
    if(jTextQuai.getText().equals("")){ 
        JOptionPane.showMessageDialog(null, "Vous devez écrire un numéro de Quai", "PROBLEME", JOptionPane.ERROR_MESSAGE);
        jTextQuai.requestFocus();
    }
    else{
        Quai unQuai = new Quai();
        unQuai.creer(jTextQuai.getText());
        jTextQuai.setText("");
        listeQuai();
    }
    }//GEN-LAST:event_jButtonAjoutQuaiActionPerformed

    private void jButtonAjoutEmplacementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutEmplacementActionPerformed
         if(jTextEmplacement.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Vous devez écrire le numéro d'un emplacement", "PROBLEME", JOptionPane.ERROR_MESSAGE);
         jTextEmplacement.requestFocus();
         
     }
         else{
         if(jComboAllee.getSelectedIndex()>0){
             Emplacement unEmplacement = new Emplacement(jComboQuai.getSelectedItem().toString(),jComboAllee.getSelectedItem().toString());
             unEmplacement.creer(jTextEmplacement.getText(),jComboQuai.getSelectedItem().toString(),jComboAllee.getSelectedItem().toString());
             jTextEmplacement.setText("");
             listeEmplacement(jComboQuai.getSelectedItem().toString(),jComboAllee.getSelectedItem().toString());
         }else{
             JOptionPane.showMessageDialog(null, "Vous devez choisir une Allée", "PROBLEME", JOptionPane.ERROR_MESSAGE);
             jComboAllee.requestFocus();
             
         }
    }//GEN-LAST:event_jButtonAjoutEmplacementActionPerformed
    }
    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
    MenuPrincipale uneFenetre = new MenuPrincipale(); 
    uneFenetre.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jButtonSupprimerQuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerQuaiActionPerformed
     if(jComboQuai.getSelectedIndex() <= 0) {
         JOptionPane.showMessageDialog(null, "Vous devez sélectionner un Quai.", "PROBLEME", JOptionPane.ERROR_MESSAGE);
         jComboQuai.requestFocus();
     }else{
         Quai unQuai = new Quai();
         unQuai.supprimer(jComboQuai.getSelectedItem().toString());
         listeQuai(); 
     }
    }//GEN-LAST:event_jButtonSupprimerQuaiActionPerformed

    private void jButtonAjoutAlleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutAlleeActionPerformed
     if(jTextAllee.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Vous devez écrire le numéro d'une allée", "PROBLEME", JOptionPane.ERROR_MESSAGE);
         jTextAllee.requestFocus();
         
     }else{
         if(jComboQuai.getSelectedIndex()>0){
             Allee uneAllee = new Allee(jComboQuai.getSelectedItem().toString());
             uneAllee.creer(jTextAllee.getText(),jComboQuai.getSelectedItem().toString());
             jTextAllee.setText("");
             listeAllee(jComboQuai.getSelectedItem().toString());
         }else{
             JOptionPane.showMessageDialog(null, "Vous devez choisir un quai", "PROBLEME", JOptionPane.ERROR_MESSAGE);
             jComboQuai.requestFocus();
             
         }
     }
    }//GEN-LAST:event_jButtonAjoutAlleeActionPerformed

    private void jComboQuaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboQuaiItemStateChanged
        if(jComboQuai.getSelectedIndex() > 0) {
            listeAllee(jComboQuai.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jComboQuaiItemStateChanged

    private void jButtonSupprimerAlleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerAlleeActionPerformed
        if(jComboQuai.getSelectedIndex() <= 0){
            JOptionPane.showMessageDialog(null, "Vous devez choisir un Quai", "PROBLEME", JOptionPane.ERROR_MESSAGE);
            jComboQuai.requestFocus();
            }else{
            if(jComboAllee.getSelectedIndex() <= 0){
                JOptionPane.showMessageDialog(null, "Vous devez sélectionner une Allée", "PROBLEME", JOptionPane.ERROR_MESSAGE);
                jComboAllee.requestFocus();
            }else{
                Allee uneAllee = new Allee();
                uneAllee.supprimer(jComboAllee.getSelectedItem().toString(),jComboQuai.getSelectedItem().toString());
                listeAllee(jComboQuai.getSelectedItem().toString());
                }
        }
    }//GEN-LAST:event_jButtonSupprimerAlleeActionPerformed

    private void jComboAlleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAlleeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboAlleeActionPerformed

    private void jButtonSupprimerEmplacementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerEmplacementActionPerformed
       if(jComboQuai.getSelectedIndex() <= 0){
            JOptionPane.showMessageDialog(null, "Vous devez choisir un Quai", "PROBLEME", JOptionPane.ERROR_MESSAGE);
            jComboQuai.requestFocus();
            }else{
                    if(jComboAllee.getSelectedIndex() <= 0){
                    JOptionPane.showMessageDialog(null, "Vous devez choisir une Allée", "PROBLEME", JOptionPane.ERROR_MESSAGE);
                    jComboAllee.requestFocus();
                    
                    }else{
                        if(jComboEmplacement.getSelectedIndex() <= 0){
                        JOptionPane.showMessageDialog(null, "Vous devez choisir un emplacement", "PROBLEME", JOptionPane.ERROR_MESSAGE);
                        jComboEmplacement.requestFocus();
                        }else{
                            Emplacement unEmplacement = new Emplacement();
                            unEmplacement.supprimer(jComboEmplacement.getSelectedItem().toString(),jComboAllee.getSelectedItem().toString(),jComboQuai.getSelectedItem().toString());
                            listeEmplacement(jComboQuai.getSelectedItem().toString(),jComboAllee.getSelectedItem().toString());
                        }
                        
                    }
           
       }
        
        
    }//GEN-LAST:event_jButtonSupprimerEmplacementActionPerformed

    private void jComboAlleeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboAlleeItemStateChanged
        if(jComboAllee.getSelectedIndex() > 0 && jComboQuai.getSelectedIndex() > 0){
        listeEmplacement(jComboQuai.getSelectedItem().toString(), jComboAllee.getSelectedItem().toString()); 
        }
    }//GEN-LAST:event_jComboAlleeItemStateChanged

    private void jComboEmplacementItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboEmplacementItemStateChanged
        if(jComboQuai.getSelectedIndex() > 0 && jComboAllee.getSelectedIndex()>0 && jComboEmplacement.getSelectedIndex() > 0){
            unModelePositionVide = new ModelePosition(jComboQuai.getSelectedItem().toString(), jComboAllee.getSelectedItem().toString(), jComboEmplacement.getSelectedItem().toString(), true);
            unModelePositionPlein = new ModelePosition(jComboQuai.getSelectedItem().toString(), jComboAllee.getSelectedItem().toString(), jComboEmplacement.getSelectedItem().toString(), false);
            jTableVide.setModel(unModelePositionVide);
            jTablePlein.setModel(unModelePositionPlein);
            
        }    
    }//GEN-LAST:event_jComboEmplacementItemStateChanged

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
            java.util.logging.Logger.getLogger(FenAjoutElements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenAjoutElements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenAjoutElements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenAjoutElements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenAjoutElements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjoutAllee;
    private javax.swing.JButton jButtonAjoutEmplacement;
    private javax.swing.JButton jButtonAjoutQuai;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JButton jButtonSupprimerAllee;
    private javax.swing.JButton jButtonSupprimerEmplacement;
    private javax.swing.JButton jButtonSupprimerQuai;
    private javax.swing.JComboBox<String> jComboAllee;
    private javax.swing.JComboBox<String> jComboEmplacement;
    private javax.swing.JComboBox<String> jComboQuai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTablePlein;
    private javax.swing.JTable jTableVide;
    private javax.swing.JTextField jTextAllee;
    private javax.swing.JTextField jTextEmplacement;
    private javax.swing.JTextField jTextQuai;
    // End of variables declaration//GEN-END:variables

}
