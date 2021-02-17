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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.sql.Date;

public class LeConteneur{
    String numid;
    String type;
    String emplacement;
    String numcli;
    Date date_arrivee;
    private static Connection laConnexion = controle.Connexion.ControleConnexion.getLaConnectionStatique();
    private final ArrayList<LeConteneur> lesEnrg = new ArrayList();

    

    public String getNumid() {
        return numid;
    }

    public void setNumid(String numid) {
        this.numid = numid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getNumcli() {
        return numcli;
    }

    public void setNumcli(String numcli) {
        this.numcli = numcli;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

   
    public LeConteneur(){
        lireRecup(2);
    }
    public LeConteneur(boolean Vide){
        if(Vide)
            lireRecup(0);
        else
             lireRecup(1);
    }
    public LeConteneur(String Numcont){
        lireRecup(Numcont);
    }
    public LeConteneur(String numid, String type, String emplacement, String numcli, Date date_arrivee) {
        this.numid = numid;
        this.type = type;
        this.emplacement = emplacement;
        this.numcli = numcli;
        this.date_arrivee = date_arrivee;
    }
     public LeConteneur(String numid, String type, String emplacement,Date date_arrivee) {
        this.numid = numid;
        this.type = type;
        this.emplacement = emplacement;
        this.date_arrivee = date_arrivee;
    }
     public boolean controlconteneur(String numcont){
        boolean verification = false;
        int tot = 0;
        int tot2 = 0;
        numcont = numcont.toUpperCase();
        HashMap convert = new HashMap();      
        convert.put('A', 10);
        convert.put('B', 12);
        convert.put('C', 13);
        convert.put('D', 14);
        convert.put('E', 15);
        convert.put('F', 16);
        convert.put('G', 17);
        convert.put('H', 18);
        convert.put('I', 19);
        convert.put('J', 20);
        convert.put('K', 21);
        convert.put('L', 23);
        convert.put('M', 24);
        convert.put('N', 25);
        convert.put('O', 26);
        convert.put('P', 27);
        convert.put('Q', 28);
        convert.put('R', 29);
        convert.put('S', 30);
        convert.put('T', 31);
        convert.put('U', 32);
        convert.put('V', 34);
        convert.put('W', 35);
        convert.put('X', 36);
        convert.put('Y', 37);
        convert.put('Z', 38);
        tot += (int)convert.get(numcont.charAt(0));
        tot += 2*(int)convert.get(numcont.charAt(1));
        tot += 4*(int)convert.get(numcont.charAt(2));
        tot += 8*(int)convert.get(numcont.charAt(3));
        tot += 16*Integer.parseInt(numcont.charAt(4)+ "");
        tot += 32*Integer.parseInt(numcont.charAt(5)+ "");
        tot += 64*Integer.parseInt(numcont.charAt(6)+ "");
        tot += 128*Integer.parseInt(numcont.charAt(7)+ "");
        tot += 256*Integer.parseInt(numcont.charAt(8)+ "");
        tot += 512*Integer.parseInt(numcont.charAt(9)+ "");
        tot2 = tot;
        tot = tot/11;
        tot = tot*11;
        tot = tot2 - tot;        
        
        if (tot == 10){
            tot = 0;
        }
        if (tot == Integer.parseInt(numcont.charAt(10)+"")){
            verification = true;
        }
        return verification;
     }
    
    public boolean creer(String numid, String type, String emplacement,Date date_arrivee){
    
     boolean bcreer= false;
      String req =null;
      try{
        req = "INSERT INTO leconteneur (numid, type, emplacement, date_arrivee) VALUES (?, ?, ?, ?)";
        PreparedStatement prepare = laConnexion.prepareStatement(req);
        prepare.setString(1,numid);
        prepare.setString(2,type);
        prepare.setString(3,emplacement);     
        prepare.setDate(4,date_arrivee);
        prepare.execute();
        prepare.close();
        bcreer=true;
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"ajout non effectuée","Probleme",JOptionPane.ERROR_MESSAGE);        
      }
      
      return bcreer;
      }
    public boolean creer(String numid, String type, String emplacement,String NumCli,Date date_arrivee){
    
     boolean bcreer= false;
      String req =null;
      try{
        req = "INSERT INTO leconteneur (numid, type, emplacement, numcli, date_arrivee) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement prepare = laConnexion.prepareStatement(req);
        prepare.setString(1,numid);
        prepare.setString(2,type);
        prepare.setString(3,emplacement);
        prepare.setString(4,NumCli);
        prepare.setDate(5,date_arrivee);
        prepare.execute();
        prepare.close();
        bcreer=true;
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"ajout non effectuée","Probleme",JOptionPane.ERROR_MESSAGE);        
      }
      
      return bcreer;
      }

    public ArrayList<LeConteneur> getLesEnrg() {
        return lesEnrg;
    }
     private void lireRecup(int vide){
        try {
            String reqSQL="";
                switch(vide){
               case 0:  reqSQL ="SELECT * FROM leconteneur WHERE numcli IS NULL";
                        break;
               case 1: reqSQL ="SELECT * FROM leconteneur WHERE numcli IS NOT NULL";
                        break;
               case 2 : reqSQL ="SELECT * FROM leconteneur";
                        break;
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
                String unnumero = rs.getString("numid");
                String untype = rs.getString("type");
                String unemplacement = rs.getString("emplacement");
                String unnumcli =rs.getString("numcli");
                Date unedate = rs.getDate("date_arrivee");
                
                
                //on ajoute l'emplacement à la liste des entregistrements
                lesEnrg.add(new LeConteneur(unnumero,untype,unemplacement,unnumcli, unedate));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur : "+ex.getMessage(),"ALERTE",JOptionPane.ERROR_MESSAGE);
        }
    }
     private void lireRecup(String unnum){
        try {
            String reqSQL="SELECT * FROM leconteneur Where numid='"+unnum+"'";
          
            //On vide les enregistrements
            lesEnrg.retainAll(lesEnrg);
            //On créé un statement
            Statement state = laConnexion.createStatement();
            //Executer la requete SQL
            ResultSet rs = state.executeQuery(reqSQL);
            //Parcourir les resultats et alimenter les enregistrements
            while(rs.next()){
                //recupere dans les variables du SELECT
                String unnumero = rs.getString("numid");
                String untype = rs.getString("type");
                String unemplacement = rs.getString("emplacement");
                String unnumcli =rs.getString("numcli");
                Date unedate = rs.getDate("date_arrivee");
                
                
                //on ajoute l'emplacement à la liste des entregistrements
                lesEnrg.add(new LeConteneur(unnumero,untype,unemplacement,unnumcli, unedate));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur : "+ex.getMessage(),"ALERTE",JOptionPane.ERROR_MESSAGE);
        }
    }
     
        public void supprimer(String numid){
               
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
        public boolean modifier (String oldC, String newC){
        
        boolean bmodifier = false;
        String requete = null;
      try{
        requete="UPDATE leconteneur set numcli=?, date_arrivee=? Where numid = ?";
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
        
    } 
     
     
     
    
     
    

