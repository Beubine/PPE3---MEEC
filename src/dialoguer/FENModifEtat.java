/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialoguer;


import controle.Modele.ModeleConteneur;
import java.awt.Toolkit;

/**
 *
 * @author Packard Bell
 */
public class FENModifEtat extends javax.swing.JFrame {

    private ModeleConteneur unModeleConteneur= new ModeleConteneur();
   
    /**
     * Creates new form FENModifEtat
     */
    public FENModifEtat() {
        initComponents();
        complementGUI();
    }
    
     private void complementGUI(){
        //Affiche le logo
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo/Tholdisimplepetit.png")));
        //Affiche le nom
     setTitle("MEEC");
    }

   
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLab_Titre = new javax.swing.JLabel();
        jBut_Quitter = new javax.swing.JButton();
        jBut_Modifier = new javax.swing.JButton();
        jButtonRetour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBut_EtatLibre = new javax.swing.JButton();
        jBut_EtatOccupe = new javax.swing.JButton();
        jBut_EtatTous = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Titre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLab_Titre.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Titre.setText("MEEC");
        getContentPane().add(jLab_Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        jBut_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/quitter1.png"))); // NOI18N
        jBut_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_QuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_Quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, 50));

        jBut_Modifier.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jBut_Modifier.setText("Modifier");
        jBut_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ModifierActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 30));

        jButtonRetour.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRetour.setText("Retour");
        jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetour, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 90, 50));

        jTable1.setModel(unModeleConteneur);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 410));

        jBut_EtatLibre.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jBut_EtatLibre.setText("Conteneur Libre");
        jBut_EtatLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_EtatLibreActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_EtatLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, -1));

        jBut_EtatOccupe.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jBut_EtatOccupe.setText("Conteneur occupé");
        jBut_EtatOccupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_EtatOccupeActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_EtatOccupe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, -1));

        jBut_EtatTous.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jBut_EtatTous.setText("Tous");
        jBut_EtatTous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_EtatTousActionPerformed(evt);
            }
        });
        getContentPane().add(jBut_EtatTous, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fond/fond.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_QuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBut_QuitterActionPerformed

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        MenuPrincipale uneFenetre = new MenuPrincipale();
        uneFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRetourActionPerformed

    private void jBut_EtatOccupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_EtatOccupeActionPerformed
        unModeleConteneur= new ModeleConteneur(false);
        jTable1.setModel(unModeleConteneur);
        

        // affiche la liste des conteneurs occupés des conteneur dans la table (coté prog)
    }//GEN-LAST:event_jBut_EtatOccupeActionPerformed

    private void jBut_EtatLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_EtatLibreActionPerformed
        // affiche la liste des conteneurs libre des conteneurs dans la table (coté prog)
        unModeleConteneur= new ModeleConteneur(true);
        jTable1.setModel(unModeleConteneur);
        
    }//GEN-LAST:event_jBut_EtatLibreActionPerformed

    private void jBut_EtatTousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_EtatTousActionPerformed
        unModeleConteneur= new ModeleConteneur();
        jTable1.setModel(unModeleConteneur);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jBut_EtatTousActionPerformed

    private void jBut_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ModifierActionPerformed
       int numlign = jTable1.getSelectedRow();
       String unnum= String.valueOf(jTable1.getValueAt(numlign, 0));
       FenModification unefenetre= new FenModification(unnum);
       unefenetre.setVisible(true);
       
       
       
    }//GEN-LAST:event_jBut_ModifierActionPerformed

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
            java.util.logging.Logger.getLogger(FENModifEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FENModifEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FENModifEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FENModifEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FENModifEtat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_EtatLibre;
    private javax.swing.JButton jBut_EtatOccupe;
    private javax.swing.JButton jBut_EtatTous;
    private javax.swing.JButton jBut_Modifier;
    private javax.swing.JButton jBut_Quitter;
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JLabel jLab_Titre;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
