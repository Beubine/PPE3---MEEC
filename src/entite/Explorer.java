package entite;

import java.awt.Dimension;
import java.io.File;
import javax.swing.*;
import javax.swing.tree.*;



 
// Classe permettant d afficher l'arborescence des disque dur
 


public class Explorer extends JFrame
{
    private File[] _roots;
    private JTree _dirs;
		
    public Explorer()
    {
		// taille de la fenetre
        setSize(500,500);
		
		// on recupère les lecteurs
        _roots = File.listRoots();
		
		// on définit notre premier noeud
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Bureau",true);
		
		// Création du jtree
        _dirs = new JTree(racine);
        _dirs.setSize(1000,500);
		
		// pour chaque lecteur
        for (int i = 1 ; i<_roots.length ; i++)
	{
			// on recupère son contenu grace a getSubDirs
            DefaultMutableTreeNode root = getSubDirs(_roots[i]);
			// et on l ajoute a notre premier noeud
            racine.add(root);
			
	}
		
		// on met le jtree dans un jscrollpane
	JScrollPane scroll = new JScrollPane(_dirs);
	scroll.setPreferredSize(new Dimension(600,600));
	scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // on ajoute notre jscrollpane
	getContentPane().add(scroll);   
    }
	
	

	 
 //Méthode récursive permettant de récupérer
	 
 //tous les fichiers et sous dossiers d un autre
	 
 //@param root un File qui représente le lecteur ou le repertoire de départ
	 
 //@return DefaultMutableTreeNode
	 


    public DefaultMutableTreeNode getSubDirs(File root)
    {
		// on créé un noeud
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode(root,true);		
		// on recupère la liste des fichiers et sous rep 
	File[] list = root.listFiles();		
	if ( list != null)
	{
			// pour chaque sous rep on appel cette methode => recursivité
		for (int j = 1 ; j<list.length ; j++)
		{
                    DefaultMutableTreeNode file = null;
                    if (list[j].isDirectory())
                    {	
                        file = getSubDirs(list[j]);  
                        racine.add(file);
                    }
		}
	}
        return racine;
    }
}