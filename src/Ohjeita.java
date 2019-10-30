import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Ohjeita extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	public Ohjeita() {
		setTitle("Ohje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ohjeita juoma-automaatin käyttöön");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(84, 11, 308, 51);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>1. Tilaa juomia painamalla kuvaketta. Voit asettaa juomien määrän<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;itse Ylläpito-valikossa.</html>");
		lblNewLabel_1.setBounds(37, 74, 387, 42);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("<html>2. Voit tallentaa automaatin tilan ja ladata aiemmin tallennetun<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;automaatin Ylläpitö-valikon kautta.</hmtl>");
		lblNewLabel_2.setBounds(37, 131, 387, 42);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("<html>3. Automaatti saattaa syödä rahasi, mutta älä lannistu vaan tilaa<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;uusi juoma jos näin käy!</html>");
		lblNewLabel_3.setBounds(37, 184, 387, 42);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("<html>4. Kun olet viimein saanut juomista tarpeeksesi, voit sulkea ohjelman<br>&nbsp;&nbsp;&nbsp;&nbsp;joko Ylläpitö-valikon Lopeta-napista, tai yksinkertaisesti<br>&nbsp;&nbsp;&nbsp;&nbsp;sulkemalla ikkunan raksista.</html>");
		lblNewLabel_4.setBounds(37, 237, 403, 77);
		contentPane.add(lblNewLabel_4);
	}
}
