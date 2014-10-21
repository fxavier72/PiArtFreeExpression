import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class piArtGui extends JFrame {

	  // Barre du haut
	  private JMenuBar menuBar = new JMenuBar();
	  
	  //Menus présents dans la barre
	  private JMenu fichier = new JMenu("Fichier");
	  private JMenu edition = new JMenu("Edition");
	  private JMenu fenetre = new JMenu("Fenêtres");
	  private JMenu aides = new JMenu("Aides");

	  // Déclaration des sous Menus fichier
	  private JMenuItem nouveau = new JMenuItem("Nouveau");
	  private JMenuItem ouvrir = new JMenuItem("Ouvrir");
	  private JMenuItem fermerProjet = new JMenuItem("Fermet le projet");
	  private JMenuItem enregistrer = new JMenuItem("Enregistrer");
	  private JMenuItem enregistrerSous = new JMenuItem("Enregistrer sous");
	  private JMenuItem importer = new JMenuItem("Importer");
	  private JMenuItem exporter = new JMenuItem("Exporter");
	  private JMenuItem quitter = new JMenuItem("Quitter");
	  
	  // Déclaration des sous menus editions
	  private JMenuItem annuler = new JMenuItem("Annuler");
	  private JMenuItem retablir = new JMenuItem("Rétablir");
	  private JMenuItem couper = new JMenuItem("Couper");
	  private JMenuItem copier = new JMenuItem("Copier");
	  private JMenuItem coller = new JMenuItem("Coller");
	  private JMenuItem rechercher = new JMenuItem("Rechercher");
	  private JMenuItem toutSelectionner = new JMenuItem("Tout sélectionner");
	  private JMenuItem toutDeselectionner = new JMenuItem("Tout désélectionner");
	  private JMenuItem transformer = new JMenuItem("Transformer");
	  
	  // Déclaration des sous menus fenêtres
	  private JMenuItem listeObjets = new JMenuItem("Liste des objets");
	  private JMenuItem effets = new JMenuItem("Effets");
	  private JMenuItem visualisationAvTrait = new JMenuItem("Visualisation avant traitement");
	  private JMenuItem visualisationApTrait = new JMenuItem("Visualisation après traitement");
	  private JMenuItem panneauControle = new JMenuItem("Panneau de contrôle");
	  
	  // Déclaration des sous menus aides
	  private JMenuItem aidePiArt = new JMenuItem("Aides de PiArtFreeExpression");
	  private JMenuItem aPropos = new JMenuItem("A propos de PiArtFreeExpression");
	  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					piArtGui frame = new piArtGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public piArtGui() {
		setTitle("PiArtFreeExpression");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 570);

		JComponent contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			//L'ordre d'ajout va déterminer l'ordre d'apparition dans le menu de gauche à droite
		    //Le premier ajouté sera tout à gauche de la barre de menu et inversement pour le dernier
		    this.menuBar.add(fichier);
		    this.menuBar.add(edition);
		    this.menuBar.add(fenetre);
		    this.menuBar.add(aides);
		    this.setJMenuBar(menuBar);
		    this.setVisible(true);
			
			// Ajout des sous menus fichier
			this.fichier.add(nouveau);
		 	this.fichier.add(ouvrir);
		 	this.fichier.add(fermerProjet);
		 	this.fichier.add(enregistrer);
		 	this.fichier.add(enregistrerSous);
		 	this.fichier.add(importer);
		 	this.fichier.add(exporter);
		    //Ajout d'un séparateur
		    this.fichier.addSeparator();
		    quitter.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		        System.exit(0);
		      }        
		    });
		    this.fichier.add(quitter); 
		    
		    // Ajout des sous menus edition
		    this.edition.add(annuler);
		    this.edition.add(retablir);
		    this.edition.addSeparator();
		    this.edition.add(couper);
		    this.edition.add(copier);
		    this.edition.add(coller);
		    this.edition.addSeparator();
		    this.edition.add(rechercher);
		    this.edition.add(toutSelectionner);
		    this.edition.add(toutDeselectionner);
		    this.edition.addSeparator();
		    this.edition.add(transformer);
		    
		    // Ajout des sous menus fenêtres 
		    this.fenetre.add(listeObjets);
		    this.fenetre.add(effets);
		    this.fenetre.addSeparator();
		    this.fenetre.add(visualisationAvTrait);
		    this.fenetre.add(visualisationApTrait);
		    this.fenetre.addSeparator();
		    this.fenetre.add(panneauControle);
		    
		    // Ajout des sous menus aides
		    this.aides.add(aidePiArt);
		    this.aides.addSeparator();
		    this.aides.add(aPropos);
		    
		    menuBar.setForeground(Color.LIGHT_GRAY);
		    menuBar.setBackground(Color.LIGHT_GRAY);
	}
}
