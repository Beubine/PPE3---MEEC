/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Packard Bell
 */

public class Typeconteneur {
    
     String typecode;	
     String typelibel;
     String phototype;
    private static Connection laConnexion = controle.Connexion.ControleConnexion.getLaConnectionStatique();
    private final ArrayList<Typeconteneur> lesEnrg = new ArrayList();

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getTypelibel() {
        return typelibel;
    }

    public void setTypelibel(String typelibel) {
        this.typelibel = typelibel;
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }

    public ArrayList<Typeconteneur> getLesEnrg() {
        return lesEnrg;
    }

    public Typeconteneur(String typecode, String typelibel, String phototype) {
        this.typecode = typecode;
        this.typelibel = typelibel;
        this.phototype = phototype;
    }
       
    public Typeconteneur(){
        lireRecup("");
    }
    public Typeconteneur(String ref){
        lireRecup(ref);
    }
    
    
       private void lireRecup(String num){
        try {
           String reqSQL;
            if (num.isEmpty()){
                reqSQL ="SELECT * FROM modele ";
            }else{
                reqSQL ="SELECT * FROM modele where typecode="+num;
            }
            
            //On vide les enregistrements
            lesEnrg.retainAll(lesEnrg);
            //On créé un statement
            Statement state = laConnexion.createStatement();
            //Executer la requete SQL
            ResultSet rs = state.executeQuery(reqSQL);
            //Parcourir les resultats et alimenter les enregistrements
            while(rs.next()){
                //recupere dans les variables du SELECT
                String untypecode = rs.getString("typecode");
                String untypelibel = rs.getString("typelibel");
                String unphototype = rs.getString("phototype");
                //on ajoute le quai à la liste des entregistrements
                lesEnrg.add(new Typeconteneur(untypecode, untypelibel, unphototype));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur : "+ex.getMessage(),"ALERTE",JOptionPane.ERROR_MESSAGE);
        }
    }

    
      public void creerLeConteneur(String numid, String type, String emplacement, String numcli, String date_arrivee) {
    String requete = null ;
    try {
             requete = "INSERT INTO leconteneur (numid, type, emplacement, numcli, date_arrivee) VALUES (?, ?, ?, ?, ?)";
             PreparedStatement prepare ;
             prepare = laConnexion.prepareStatement(requete);
             prepare.setString(1, numid);
             prepare.setString(2, type);
             prepare.setString(3, emplacement);
             prepare.setString(4, numcli);
             prepare.setString(5, date_arrivee);
             prepare.execute();
             prepare.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Création impossible :" + ex.getMessage(), "PROBLEME", JOptionPane.ERROR_MESSAGE);
        }
}
    public boolean modifierLeConteneur (String oldC, String newC){
      
        boolean bmodifier = false;
        String requete = null;
      try{
        requete="UPDATE leconteneur set numid=? Where numid = ?";
        PreparedStatement prepare = laConnexion.prepareStatement(requete);
        prepare.setString(1,newC);
        prepare.setString(2, oldC);
        prepare.executeUpdate();
        bmodifier=true;
      }catch (SQLException ex){
          
          JOptionPane.showMessageDialog(null,"Modification rencontrée, probleme rencontreé","Probleme",JOptionPane.ERROR_MESSAGE);
      }
      return bmodifier;
      }

    public void supprimerLeConteneur(String numid, String type, String emplacement, String numcli, String date_arrivee){
      
            try {
                String requete = "DELETE FROM leconteneur WHERE numid=?"; 
                PreparedStatement prepare = laConnexion.prepareStatement(requete);
                prepare.setString(1, numid);               
                prepare.execute();
                prepare.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Suppression non effectuée :" + ex.getMessage(),"PROBLEME",JOptionPane.ERROR_MESSAGE);               
            }
        
    }


    
    
    
    
}



