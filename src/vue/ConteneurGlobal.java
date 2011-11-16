
package vue;

import java.awt.Dimension;
import javax.swing.JSplitPane;
import vue.Editeurs.ConteneurEditeurs;
import vue.Menus.MenuTextuel;

@SuppressWarnings("serial")
public class ConteneurGlobal extends JSplitPane
{
	// ----------------------------------------- //
	// ----------------ATRIBUTS----------------- //
	// ----------------------------------------- //
	
	public static Integer		TAILLE_X	= FenetrePrincipale.TAILLE_X;
	public static Integer		TAILLE_Y	= FenetrePrincipale.TAILLE_Y - MenuTextuel.TAILLE_Y;
	
	private ConteneurEditeurs	conteneurEd;
	private NavigateurFichiers	navigateur;
	
	// ----------------------------------------- //
	// --------------CONSTRUCTEURS-------------- //
	// ----------------------------------------- //
	
	public ConteneurGlobal()
	{
		buildConteneurGlobal();
		buildConteneurEditeurs();
		// buildNavigateur();
	}
	
	// ----------------------------------------- //
	// -------------INITIALISEURS--------------- //
	// ----------------------------------------- //
	
	private void buildConteneurGlobal()
	{
		this.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		
		this.setSize(TAILLE_X, TAILLE_Y);
		this.setPreferredSize(new Dimension(TAILLE_X, TAILLE_Y));
	}
	
	private void buildNavigateur()
	{
		setNavigateur(new NavigateurFichiers());
		this.setLeftComponent(conteneurEd);
	}
	
	private void buildConteneurEditeurs()
	{
		conteneurEd = new ConteneurEditeurs();
		this.setRightComponent(conteneurEd);
	}
	
	// ----------------------------------------- //
	// -----------------METHODES---------------- //
	// ----------------------------------------- //
	
	// ----------------------------------------- //
	// ---------------ACCESSEURS---------------- //
	// ----------------------------------------- //
	
	public ConteneurEditeurs getEditeur()
	{
		return conteneurEd;
	}
	
	public NavigateurFichiers getNavigateur()
	{
		return navigateur;
	}
	
	// ----------------------------------------- //
	// ----------------MUTATEURS---------------- //
	// ----------------------------------------- //
	
	public void setEditeur(ConteneurEditeurs editeur)
	{
		this.conteneurEd = editeur;
	}
	
	public void setNavigateur(NavigateurFichiers navigateur)
	{
		this.navigateur = navigateur;
	}
	
}
