/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.Modele;

import entite.LeConteneur;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Packard Bell
 */
public class ModeleConteneur extends AbstractTableModel{

    LeConteneur instanceLeConteneur;
    private ArrayList<LeConteneur> lesDonnees;
    private final String[] lesTitres= {"N°Conteneur", "Type", "Emplacement", "N°Client","Date D'Arrivée"};

public ModeleConteneur (boolean Vide) {
        this.instanceLeConteneur = new LeConteneur(Vide);
        this.lesDonnees = instanceLeConteneur.getLesEnrg(); 

    }

public ModeleConteneur(){
        this.instanceLeConteneur = new LeConteneur();
        this.lesDonnees = instanceLeConteneur.getLesEnrg(); 
}
 
    public int getRowCount() {
        return lesDonnees.size(); // Donne la taille de la collection LesDonnees
    }

    @Override
    public int getColumnCount() {
            return lesTitres.length; // Donne le nombre de colonne dans le modèle
    }

    @Override
    public String getColumnName(int columnIndex){
        return lesTitres[columnIndex]; 
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return lesDonnees.get(rowIndex).getNumid();
            case 1: return lesDonnees.get(rowIndex).getType();
            case 2 : return lesDonnees.get(rowIndex).getEmplacement();
            case 3 : return lesDonnees.get(rowIndex).getNumcli();
            case 4 : return lesDonnees.get(rowIndex).getDate_arrivee();
            default : return null; 
        }
    }

}