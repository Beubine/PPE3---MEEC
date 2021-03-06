/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Packard Bell
 */
public class Emplacement {
    String numemplacement;
    String numallee;
    String numquai;
    private static Connection laConnexion = controle.Connexion.ControleConnexion.getLaConnectionStatique();
    private final ArrayList<Emplacement> lesEnrg = new ArrayList();

    public String getNumemplacement() {
        return numemplacement;
    }

    public void setNumemplacement(String numemplacement) {
        this.numemplacement = numemplacement;
    }

    public String getNumalee() {
        return numallee;
    }

    public void setNumalee(String numallee) {
        this.numallee = numallee;
    }

    public String getNumquai() {
        return numquai;
    }

    public void setNumquai(String numquai) {
        this.numquai = numquai;
    }

    public Emplacement(String numemplacement, String numalee, String numquai) {
        this.numemplacement = numemplacement;
        this.numallee = numallee;
        this.numquai = numquai;
    }
    
    public Emplacement (){
        lireRecup("","");
    }
    
    public Emplacement (String unQuai){
        lireRecup(unQuai,"");
    }
    public Emplacement (String unQuai, String uneAllee){
        lireRecup(unQuai, uneAllee);
    }
    
    public void creer (String numemplacement, String numquai, String numallee ) {
    String requete = null ;
    Position unePosition = new Position ();
    try {
             requete = "INSERT INTO emplacement (numemplacement, numquai, numallee) VALUES (?, ?, ?)";
             PreparedStatement prepare ;
             prepare = laConnexion.prepareStatement(requete);
             prepare.setString(1, numemplacement);
             prepare.setString(2, numquai);
             prepare.setString(3, numallee);
             prepare.execute();
             prepare.close();
             int i ;
             for(i=0;i<=3;i++){
                 unePosition.creer(numquai+numallee+numemplacement+i,numemplacement, numquai, numallee, String.valueOf(i),null);
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Création impossible :" + ex.getMessage(), "PROBLEME", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void supprimer(String unemplacement, String uneallee, String unquai){
        
        Position UnePosition = new Position(unemplacement, uneallee, unquai);
        
        if(UnePosition.getLesEnrg().isEmpty()){       
            try {
                String requete = "DELETE FROM emplacement WHERE numemplacement=? and numallee=? and numquai=?"; 
                PreparedStatement prepare = laConnexion.prepareStatement(requete);
                prepare.setString(1, unemplacement);
                prepare.setString(2, uneallee);
                prepare.setString(3, unquai);
                prepare.execute();
                prepare.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Suppression non effectuée :" + ex.getMessage(),"PROBLEME",JOptionPane.ERROR_MESSAGE);
                
            }
        }else{
            JOptionPane.showMessageDialog(null,"Suppression impossible, il reste des positions","PROBLEME",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public ArrayList<Emplacement> getLesEnrg() {
        return lesEnrg;
    }
    
// Avec le numéro de l'allée on lit l'entrée ou on récupère une liste de toutes les allées
    private void lireRecup(String quai, String allee){
        try {
            //Lire la BDD et remplir le tab lesEnreg
            if (allee.equals("")){
                allee="%";//% pour que la requete envoi tout
            }
            if(quai.equals("")){
                quai="%";
            }
            
            String reqSQL ="SELECT * FROM Emplacement WHERE numquai LIKE '" + quai +"' AND numallee like '"+ allee +"' ORDER BY numquai, numallee, numemplacement";
            //On vide les enregistrements
            lesEnrg.retainAll(lesEnrg);
            //On créé un statement
            Statement state = laConnexion.createStatement();
            //Executer la requete SQL
            ResultSet rs = state.executeQuery(reqSQL);
            //Parcourir les resultats et alimenter les enregistrements
            while(rs.next()){
                //recupere dans les variables du SELECT
                String unQuai = rs.getString("numquai");
                String uneAllee = rs.getString("numallee");
                String unePosition = rs.getString("numemplacement");
                //on ajoute l'emplacement à la liste des entregistrements
                lesEnrg.add(new Emplacement(unePosition,uneAllee,unQuai));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur : "+ex.getMessage(),"ALERTE",JOptionPane.ERROR_MESSAGE);
        }
    }
}
