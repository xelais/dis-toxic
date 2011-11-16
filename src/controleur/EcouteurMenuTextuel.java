
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vue.Editeurs.ConteneurEditeurs;
import vue.Editeurs.Editeurs;
import vue.Menus.MenuTextuel;

public class EcouteurMenuTextuel implements ActionListener
{
	// ---------------------------------//
	// ------------ATRIBUTS-------------//
	// ---------------------------------//
	
	private MenuTextuel			mt;
	private ConteneurEditeurs	ce;
	
	// ---------------------------------//
	// ----------CONSTRUCTEURS----------//
	// ---------------------------------//
	
	public EcouteurMenuTextuel()
	{
		
	}
	
	public EcouteurMenuTextuel(MenuTextuel mt)
	{
		this.mt = mt;
	}
	
	public EcouteurMenuTextuel(ConteneurEditeurs ce)
	{
		this.ce = ce;
	}
	
	// ---------------------------------//
	// ----------INITIALISEURS----------//
	// ---------------------------------//
	
	// ---------------------------------//
	// -------------METHODES------------//
	// ---------------------------------//
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == mt.getItemsFichier()[0])
		{
			Editeurs ed = new Editeurs();
			ce.add(ed);
		}
		if (e.getSource() == mt.getItemsFichier()[1]) System.out.println("Ouvrir/Ctrl+O");
		if (e.getSource() == mt.getItemsFichier()[2]) System.out.println("Enregistrer/Ctrl+S");
		if (e.getSource() == mt.getItemsFichier()[3]) System.out.println("Enregistrer sous/Ctrl+Maj+S");
		if (e.getSource() == mt.getItemsFichier()[4]) System.exit(0);
		if (e.getSource() == mt.getItemsAPropos()[0]) System.out.println("Help/F1");
	}
	
	// ---------------------------------//
	// -----------ACCESSEURS------------//
	// ---------------------------------//
	
	// ---------------------------------//
	// ------------MUTATEURS------------//
	// ---------------------------------//
	
}
