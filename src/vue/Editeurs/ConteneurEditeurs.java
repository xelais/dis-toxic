
package vue.Editeurs;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import controleur.EcouteurMenuTextuel;
import vue.ConteneurGlobal;
import vue.FenetrePrincipale;
import vue.NavigateurFichiers;
import vue.Menus.MenuTextuel;

@SuppressWarnings("serial")
public class ConteneurEditeurs extends JTabbedPane
{
	// ----------------------------------------- //
	// ----------------ATRIBUTS----------------- //
	// ----------------------------------------- //
	
	public static Integer	TAILLE_X	= ConteneurGlobal.TAILLE_X - NavigateurFichiers.TAILLE_X;
	public static Integer	TAILLE_Y	= ConteneurGlobal.TAILLE_Y;
	
	private Editeurs		editeurs;
	private String			titreEditeurs = "Triplet";
	
	// ----------------------------------------- //
	// --------------CONSTRUCTEURS-------------- //
	// ----------------------------------------- //
	
	public ConteneurEditeurs()
	{
		this.setSize(TAILLE_X, TAILLE_Y);
		this.setPreferredSize(new Dimension(TAILLE_X,TAILLE_Y));

		editeurs = new Editeurs();
		this.add(titreEditeurs,editeurs);
	}
	
	// ----------------------------------------- //
	// ----------------LISTENERS---------------- //
	// ----------------------------------------- //
	
	private void initListeners()
	{
		EcouteurMenuTextuel emt = new EcouteurMenuTextuel(this);
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
