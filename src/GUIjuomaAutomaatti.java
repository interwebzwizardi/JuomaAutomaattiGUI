import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIjuomaAutomaatti extends JFrame {

	// Luokkamuuttujat
	// Esitell‰‰n t‰‰ll‰ jotta komponentteihin voidaan viitata mist‰ tahansa luokan
	// sis‰lt‰

	JPanel contentPane;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	private JMenuItem mntmAsetaKaakaonMr;
	private JMenuBar menuBar;
	private JMenu mnYllpito;
	private JMenuItem mntmAsetaKahvinMr;
	private JMenuItem mntmAsetaTeenMr;
	private JMenuItem mntmAsetaKaakaonMr_1;
	private JMenuItem mntmTallennaAutomaatinTila_1;
	private JMenuItem mntmLataaAutomaatti_1;
	private JMenuItem mntmLopeta;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JLabel lblKahvi;
	private JLabel lblTee;
	private JLabel lblKaakao;
	private JLabel lblKahvia;
	private JLabel lblTeet;
	private JLabel lblKaakaota;
	private JMenu mnTietojaOhjelmasta;
	private JMenuItem mntmVersiotiedot;
	private JMenuItem mntmOhje;


	/**
	 * Main-metodi, joka k‰ynnist‰‰ sovelluksen
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Luodaan ensin uusi JuomaAutomaatti-olio
					juomaAutomaatti guiAutomaatti = new juomaAutomaatti();

					// K‰yttˆliittym‰ saa parametrina olion, jonka tiedot se n‰ytt‰‰
					GUIjuomaAutomaatti frame = new GUIjuomaAutomaatti(guiAutomaatti);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Konstruktori jossa rakennetaan k‰yttˆliittym‰
	
	public GUIjuomaAutomaatti(juomaAutomaatti guiAutomaatti) {

		// Ikkunan otsikko ja koko

		setTitle("Kahviautomaatti GUI v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 705);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnYllpito = new JMenu("Yll\u00E4pito");
		menuBar.add(mnYllpito);
		
		mntmAsetaKahvinMr = new JMenuItem("Aseta kahvin m\u00E4\u00E4r\u00E4");
		mntmAsetaKahvinMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = -1;
				while(i<0) {
					
				String inputKahvi = JOptionPane.showInputDialog("Aseta kahvin m‰‰r‰");
				
				if(inputKahvi.length() > 0) {
					
				i++;
				
				int uusiArvoKahville = Integer.parseInt(inputKahvi);
				
				guiAutomaatti.setKahvia(uusiArvoKahville);
				lblKahvia.setText("Kahvia:" + guiAutomaatti.getKahvia());
				
				//Asetetaan v‰ri m‰‰r‰n mukaan
				if(guiAutomaatti.getKahvia()<20) {
					lblKahvia.setForeground(Color.RED);
				}
				else{
					lblKahvia.setForeground(Color.DARK_GRAY);
				}
				}
				}
			}
		});
		mnYllpito.add(mntmAsetaKahvinMr);
		
		mntmAsetaTeenMr = new JMenuItem("Aseta teen m\u00E4\u00E4r\u00E4");
		mntmAsetaTeenMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = -1;
				while(i<0) {
					
				String inputTee = JOptionPane.showInputDialog("Aseta teen m‰‰r‰");
				
				if(inputTee.length() > 0) {
					
				i++;
				
				int uusiArvoTeelle = Integer.parseInt(inputTee);
				
				guiAutomaatti.setTeet‰(uusiArvoTeelle);
				lblTeet.setText("Teet‰:" + guiAutomaatti.getTeet‰());
				
				//Asetetaan v‰ri m‰‰r‰n mukaan
				if(guiAutomaatti.getTeet‰()<20) {
					lblTeet.setForeground(Color.RED);
				}
				else{
					lblTeet.setForeground(Color.DARK_GRAY);
				}
				}
				}
			}
		});
		mnYllpito.add(mntmAsetaTeenMr);
		
		mntmAsetaKaakaonMr_1 = new JMenuItem("Aseta kaakaon m\u00E4\u00E4r\u00E4");
		mntmAsetaKaakaonMr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = -1;
				while(i<0) {
					
				String inputKaakao = JOptionPane.showInputDialog("Aseta kaakaon m‰‰r‰");
				
				if(inputKaakao.length() > 0) {
					
				i++;
				
				int uusiArvoKaakaolle = Integer.parseInt(inputKaakao);
				
				guiAutomaatti.setKaakaota(uusiArvoKaakaolle);
				lblKaakaota.setText("Kaakaota:" + guiAutomaatti.getKaakaota());
				
				//Asetetaan v‰ri m‰‰r‰n mukaan
				if(guiAutomaatti.getKaakaota()<20) {
					lblKaakaota.setForeground(Color.RED);
				}
				else{
					lblKaakaota.setForeground(Color.DARK_GRAY);
				}
				}
				}
			}
		});
		mnYllpito.add(mntmAsetaKaakaonMr_1);
		
		mntmTallennaAutomaatinTila_1 = new JMenuItem("Tallenna automaatin tila");
		mntmTallennaAutomaatinTila_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Sarjallistamista.kirjoitaTiedostoon(guiAutomaatti);
				} catch (IOException e) {
					System.out.println("Automaatin tallentaminen ep‰onnistui.");
					e.printStackTrace();
				}
				
			}
		});
		mnYllpito.add(mntmTallennaAutomaatinTila_1);
		
		mntmLataaAutomaatti_1 = new JMenuItem("Lataa automaatti");
		mntmLataaAutomaatti_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					juomaAutomaatti uusi = Sarjallistamista.lueTiedostosta();
					
					//Asetetaan tallennetut arvot muuttujiin
					guiAutomaatti.setKahvia(uusi.getKahvia());
					guiAutomaatti.setTeet‰(uusi.getTeet‰());
					guiAutomaatti.setKaakaota(uusi.getKaakaota());
					
					//p‰ivitet‰‰n lukemat k‰yttˆliittym‰‰n n‰kyville
					lblKahvia.setText("Kahvia:" + guiAutomaatti.getKahvia());
					
					if(guiAutomaatti.getKahvia() <= 20) {
						lblKahvia.setForeground(Color.RED);
					}

					lblTeet.setText("Teet‰:" + guiAutomaatti.getTeet‰());
					
					if(guiAutomaatti.getTeet‰() <= 20) {
						lblTeet.setForeground(Color.RED);
					}
					
					lblKaakaota.setText("Kaakaota:" + guiAutomaatti.getKaakaota());
					
					if(guiAutomaatti.getKaakaota() <= 20) {
						lblKaakaota.setForeground(Color.RED);
					}
					
					
				} catch (FileNotFoundException e1) {
					System.out.println("Automaatin lataaminen ep‰onnistui.");
					e1.printStackTrace();
				}
				
			}
		});
		mnYllpito.add(mntmLataaAutomaatti_1);
		
		mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnYllpito.add(mntmLopeta);
		
		mnTietojaOhjelmasta = new JMenu("Tietoja ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);
		
		mntmVersiotiedot = new JMenuItem("Versiotiedot");
		mntmVersiotiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				versiotiedot Versio = new versiotiedot();
				
				Versio.setVisible(true);
				
			}
		});
		mnTietojaOhjelmasta.add(mntmVersiotiedot);
		
		mntmOhje = new JMenuItem("Ohje");
		mntmOhje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Ohjeita ohjeet = new Ohjeita();
				
				ohjeet.setVisible(true);
			}
		});
		mnTietojaOhjelmasta.add(mntmOhje);

	 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Kahvi");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent args) {
				guiAutomaatti.valmistaKahvi();
				lblKahvia.setText("Kahvia:" + guiAutomaatti.getKahvia());
				
				if(guiAutomaatti.getKahvia() <= 20) {
					lblKahvia.setForeground(Color.RED);
				}
				
			}
		});
		btnNewButton_1 = new JButton("Tee");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guiAutomaatti.valmistaTee();
				lblTeet.setText("Teet‰:" + guiAutomaatti.getTeet‰());
				
				if(guiAutomaatti.getTeet‰() <= 20) {
					lblTeet.setForeground(Color.RED);
				}
				
			}
		});
		btnNewButton_2 = new JButton("Kaakao");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guiAutomaatti.valmistaKaakao();
				lblKaakaota.setText("Kaakaota:" + guiAutomaatti.getKaakaota());
				
				if(guiAutomaatti.getKaakaota() <= 20) {
					lblKaakaota.setForeground(Color.RED);
				}
				
			}
		});
		
		Image kahviKuva = new ImageIcon(this.getClass().getResource("/JAVA_GUI_Kahvia.JPG")).getImage();
		btnNewButton.setIcon(new ImageIcon(kahviKuva));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(27, 25, 160, 160);
		contentPane.add(btnNewButton);
		
		Image teeKuva = new ImageIcon(this.getClass().getResource("/JAVA_GUI_Teet‰.jpg")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(teeKuva));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(27, 225, 160, 160);
		contentPane.add(btnNewButton_1);
		
		Image kaakaoKuva = new ImageIcon(this.getClass().getResource("/JAVA_GUI_Kaakaota.jpg")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(kaakaoKuva));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(27, 425, 160, 160);
		contentPane.add(btnNewButton_2);
		
		lblKahvi = new JLabel("Kahvi");
		lblKahvi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKahvi.setBounds(77, 196, 46, 14);
		contentPane.add(lblKahvi);
		
		lblTee = new JLabel("Tee");
		lblTee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTee.setBounds(77, 396, 46, 14);
		contentPane.add(lblTee);
		
		lblKaakao = new JLabel("Kaakao");
		lblKaakao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKaakao.setBounds(75, 596, 58, 14);
		contentPane.add(lblKaakao);
		
		lblKahvia = new JLabel("Kahvia:");
		lblKahvia.setText("Kahvia:" + guiAutomaatti.getKahvia());
		lblKahvia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKahvia.setBounds(270, 100, 169, 36);
		contentPane.add(lblKahvia);
		
		lblTeet = new JLabel("Teet\u00E4:");
		lblTeet.setText("Teet‰:" + guiAutomaatti.getTeet‰());
		lblTeet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTeet.setBounds(270, 300, 169, 36);
		contentPane.add(lblTeet);
		
		lblKaakaota = new JLabel("Kaakaota:");
		lblKaakaota.setText("Kaakaota:" + guiAutomaatti.getKaakaota());
		lblKaakaota.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKaakaota.setBounds(270, 500, 169, 36);
		contentPane.add(lblKaakaota);
	}
}