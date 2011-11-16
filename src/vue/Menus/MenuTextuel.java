
package vue.Menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import vue.FenetrePrincipale;
import controleur.EcouteurMenuTextuel;

@SuppressWarnings("serial")
public class MenuTextuel extends JMenuBar
{
	// ----------------------------------------- //
	// ----------------ATTRIBUTS---------------- //
	// ----------------------------------------- //
	
	public static Integer	TAILLE_X			= FenetrePrincipale.TAILLE_X;
	public static Integer	TAILLE_Y			= FenetrePrincipale.TAILLE_Y / 20;
	public static Color		COULEUR_BG			= Color.WHITE;
	
	private JMenu			menuFichier;
	private String			titresMenuFichier	= "Fichier";
	private JMenuItem[]		itemsFichier		= new JMenuItem[5];
	private String[]		titresItemsFichier	= { "Nouveau", "Ouvrir", "Enregistrer", "Enregistrer sous", "Quitter" };
	
	private JMenu			menuAPropos;
	private String			titreAPropos		= "A propos";
	private JMenuItem[]		itemsAPropos		= new JMenuItem[2];
	private String[]		titresItemsAPropos	= { "Aide", "A propos de..." };
	
	// ----------------------------------------- //
	// --------------CONSTRUCTEURS-------------- //
	// ----------------------------------------- //
	
	public MenuTextuel()
	{
		buildBarre();
		buildMenuFichier();
		buildMenuAPropos();
		
		initEcouteurs();
	}
	
	// ----------------------------------------- //
	// -----------------BUILDERS---------------- //
	// ----------------------------------------- //
	
	private void buildBarre()
	{
		this.setPreferredSize(new Dimension(TAILLE_X, TAILLE_Y));
		this.setSize(new Dimension(TAILLE_X, TAILLE_Y));
		this.setBackground(COULEUR_BG);
	}
	
	private void buildMenuFichier()
	{
		menuFichier = new JMenu(titresMenuFichier);
		menuFichier.setMnemonic(KeyEvent.VK_F);
		this.add(menuFichier);
		
		for (int i = 0; i < itemsFichier.length; i++)
		{
			switch (i)
			{
				case 0:
					builMenuItems(i, menuFichier, itemsFichier, titresItemsFichier,
							KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
					break;
				case 1:
					builMenuItems(i, menuFichier, itemsFichier, titresItemsFichier,
							KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
					menuFichier.addSeparator();
					break;
				case 2:
					builMenuItems(i, menuFichier, itemsFichier, titresItemsFichier,
							KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
					break;
				case 3:
					builMenuItems(i, menuFichier, itemsFichier, titresItemsFichier,
							KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
					menuFichier.addSeparator();
					break;
				case 4:
					builMenuItems(i, menuFichier, itemsFichier, titresItemsFichier,
							KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
					break;
				default:
					System.out.println("erreur::MenuTop::buildMenuFichier");
			}
		}
	}
	
	private void buildMenuAPropos()
	{
		menuAPropos = new JMenu(titreAPropos);
		menuAPropos.setMnemonic(KeyEvent.VK_P);
		this.add(menuAPropos);
		
		for (int i = 0; i < itemsAPropos.length; i++)
		{
			switch (i)
			{
				case 0:
					builMenuItems(i, menuAPropos, itemsAPropos, titresItemsAPropos, KeyStroke.getKeyStroke(112, 0));
					menuAPropos.addSeparator();
					break;
				case 1:
					builMenuItems(i, menuAPropos, itemsAPropos, titresItemsAPropos);
					break;
				default:
					System.out.println("erreur::MenuTop::buildMenuFichier");
			}
		}
	}
	
	private void builMenuItems(Integer index,JMenu menu,JMenuItem[] items,String[] titres)
	{
		items[index] = new JMenuItem(titres[index]);
		items[index].setName(titres[index]);
		menu.add(items[index]);
	}
	
	private void builMenuItems(Integer index,JMenu menu,JMenuItem[] items,String[] titres,KeyStroke ks)
	{
		items[index] = new JMenuItem(titres[index]);
		items[index].setName(titres[index]);
		items[index].setAccelerator(ks);
		menu.add(items[index]);
	}
	
	// ----------------------------------------- //
	// --------------INITIALISEURS-------------- //
	// ----------------------------------------- //
	
	private void initEcouteurs()
	{
		EcouteurMenuTextuel ecouteur = new EcouteurMenuTextuel(this);
		
		for (int i = 0; i < itemsFichier.length; i++)
			itemsFichier[i].addActionListener(ecouteur);
		
		for (int i = 0; i < itemsAPropos.length; i++)
			itemsAPropos[i].addActionListener(ecouteur);
		
	}
	
	// ----------------------------------------- //
	// -----------------METHODES---------------- //
	// ----------------------------------------- //
	
	// ----------------------------------------- //
	// ---------------ACCESSEURS---------------- //
	// ----------------------------------------- //
	
	public JMenu getMenuFichier()
	{
		return menuFichier;
	}
	
	public JMenuItem[] getItemsFichier()
	{
		return itemsFichier;
	}
	
	public String[] getTitresItemsFichier()
	{
		return titresItemsFichier;
	}
	
	public String getTitreMenuFichier()
	{
		return titresMenuFichier;
	}
	
	public JMenu getMenuAPropos()
	{
		return menuAPropos;
	}
	
	public String getTitreAPropos()
	{
		return titreAPropos;
	}
	
	public JMenuItem[] getItemsAPropos()
	{
		return itemsAPropos;
	}
	
	public String[] getTitresItemsAPropos()
	{
		return titresItemsAPropos;
	}
	
	// ----------------------------------------- //
	// ----------------MUTATEURS---------------- //
	// ----------------------------------------- //
	
	public void setMenuFichier(JMenu menuFichier)
	{
		this.menuFichier = menuFichier;
	}
	
	public void setItemsFichier(JMenuItem[] itemsFichier)
	{
		this.itemsFichier = itemsFichier;
	}
	
	public void setTitresItemsFichier(String[] titresItemsFichier)
	{
		this.titresItemsFichier = titresItemsFichier;
	}
	
	public void setTitreMenuFichier(String titreMenuFichier)
	{
		this.titresMenuFichier = titreMenuFichier;
	}
	
	public void setMenuAPropos(JMenu menuAPropos)
	{
		this.menuAPropos = menuAPropos;
	}
	
	public void setTitreAPropos(String titreAPropos)
	{
		this.titreAPropos = titreAPropos;
	}
	
	public void setItemsAPropos(JMenuItem[] itemsAPropos)
	{
		this.itemsAPropos = itemsAPropos;
	}
	
	public void setTitresItemsAPropos(String[] titresItemsAPropos)
	{
		this.titresItemsAPropos = titresItemsAPropos;
	}
	
}
