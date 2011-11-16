
package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vue.Menus.MenuTextuel;

@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame
{
	// ----------------------------------------- //
	// ----------------ATTRIBUTS---------------- //
	// ----------------------------------------- //
	
	public static Integer	TAILLE_X	= 800;
	public static Integer	TAILLE_Y	= 600;
	public static String	TITRE		= "Dis'toxic";
	
	private MenuTextuel		menu;
	private ConteneurGlobal	conteneurGlobal;
	
	// ----------------------------------------- //
	// --------------CONSTRUCTEURS-------------- //
	// ----------------------------------------- //
	
	public FenetrePrincipale()
	{
		super();
		
		setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		
		buildMenuTop();
		buildConteneurGlobal();
		buildFenetre();
	}
	
	// ----------------------------------------- //
	// --------------INITIALISEURS-------------- //
	// ----------------------------------------- //
	
	private void buildFenetre()
	{
		this.setTitle(TITRE);
		this.setSize(TAILLE_X, TAILLE_Y);
		this.setPreferredSize(new Dimension(TAILLE_X, TAILLE_Y));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildMenuTop()
	{
		menu = new MenuTextuel();
		this.getContentPane().add(menu, BorderLayout.NORTH);
	}
	
	private void buildConteneurGlobal()
	{
		conteneurGlobal = new ConteneurGlobal();
		this.getContentPane().add(conteneurGlobal, BorderLayout.CENTER);
	}
	
	// ----------------------------------------- //
	// -----------------METHODES---------------- //
	// ----------------------------------------- //
	
	public void displayLF()
	{
		UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
		
		for (int i = 0; i < info.length; i++)
		{
			String nomLF = info[i].getName();
			String nomClasse = info[i].getClassName();
			System.out.println("NOM : " + nomLF);
			System.out.println('\t' + "CLASSE : " + nomClasse);
		}
	}
	
	// ----------------------------------------- //
	// ---------------ACCESSEURS---------------- //
	// ----------------------------------------- //
	
	public MenuTextuel getMenu()
	{
		return menu;
	}
	
	// ----------------------------------------- //
	// ----------------MUTATEURS---------------- //
	// ----------------------------------------- //
	
	public void setLookAndFeel(String LF)
	{
		try
		{
			UIManager.setLookAndFeel(LF);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedLookAndFeelException e)
		{
			e.printStackTrace();
		}
	}
	
	public void setMenu(MenuTextuel menu)
	{
		this.menu = menu;
	}
	
}
