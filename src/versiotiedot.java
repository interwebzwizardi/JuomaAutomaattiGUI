import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;

public class versiotiedot extends JFrame {

	//Komponenttien esittely
	
	private JPanel contentPane;
	private JLabel lblJuomaautomaattiguiVersio;
	private JLabel lblVilleJaatinen;
	
	//Määritetään versiotiedot-ikkunan ulkonäkö ja asettelu konstruktorissa
	
	public versiotiedot() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJuomaautomaattiguiVersio = new JLabel("Juoma-AutomaattiGUI Versio 1.0");
		lblJuomaautomaattiguiVersio.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblJuomaautomaattiguiVersio.setBounds(67, 94, 357, 52);
		contentPane.add(lblJuomaautomaattiguiVersio);
		
		lblVilleJaatinen = new JLabel("Ville Jaatinen ©");
		lblVilleJaatinen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVilleJaatinen.setBounds(173, 132, 97, 14);
		contentPane.add(lblVilleJaatinen);
	}
}
