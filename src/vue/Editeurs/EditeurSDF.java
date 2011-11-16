package vue.Editeurs;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class EditeurSDF extends JPanel
{
	// ----------------------------------------- //
	// ----------------ATRIBUTS----------------- //
	// ----------------------------------------- //

	public static Integer	TAILLE_X	= Editeurs.TAILLE_X;
	public static Integer	TAILLE_Y	= 2 * Editeurs.TAILLE_Y / 5;
	
	// ----------------------------------------- //
	// --------------CONSTRUCTEURS-------------- //
	// ----------------------------------------- //
	
	public EditeurSDF()
	{
		this.setSize(TAILLE_X, TAILLE_Y);
		this.setPreferredSize(new Dimension(TAILLE_X,TAILLE_Y));
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
