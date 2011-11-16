
package vue;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import vue.Editeurs.ConteneurEditeurs;
import vue.Menus.MenuTextuel;

@SuppressWarnings("serial")
public class NavigateurFichiers extends JTree
{
	// ----------------------------------------- //
	// ----------------ATRIBUTS----------------- //
	// ----------------------------------------- //
	
	public static Integer			TAILLE_X	= 100;
	public static Integer			TAILLE_Y	= ConteneurGlobal.TAILLE_Y;
	private static Color			COLOR_BG	= Color.GREEN;
	
	private DefaultMutableTreeNode	racine;
	private DefaultTreeModel		modele;
	
	// ----------------------------------------- //
	// --------------CONSTRUCTEURS-------------- //
	// ----------------------------------------- //
	
	public NavigateurFichiers()
	{
		super();
		this.setPreferredSize(new Dimension(TAILLE_X, TAILLE_Y));
	}
	
	// ----------------------------------------- //
	// -------------INITIALISEURS--------------- //
	// ----------------------------------------- //
	
	// ----------------------------------------- //
	// -----------------METHODES---------------- //
	// ----------------------------------------- //
	
	// ----------------------------------------- //
	// ---------------ACCESSEURS---------------- //
	// ----------------------------------------- //
	
	// ----------------------------------------- //
	// ----------------MUTATEURS---------------- //
	// ----------------------------------------- //
	
}
