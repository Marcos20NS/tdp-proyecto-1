package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import java.util.Date;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;

	public SimplePresentationScreen(Student studentData) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(707, 338));
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 271);
		tabInformation = new JPanel();
		tabInformation.setBackground(Color.LIGHT_GRAY);
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la informaciÃ³n declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(24, 25, 95, 25);
		tabInformation.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(24, 65, 95, 25);
		tabInformation.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(24, 113, 95, 25);
		tabInformation.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(24, 159, 95, 25);
		tabInformation.add(lblEmail);
		
		JLabel lblGithubUrl = new JLabel("Github URL");
		lblGithubUrl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGithubUrl.setBounds(24, 201, 95, 25);
		tabInformation.add(lblGithubUrl);
		
		JTextPane textPane = new JTextPane();
		textPane.setContentType("text/plain");
		textPane.setEditable(false);
		textPane.setBounds(95, 25, 320, 25);
		textPane.setText(String.valueOf(studentData.getId()));
		tabInformation.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(95, 65, 320, 25);
		textPane_1.setText(studentData.getLastName());
		tabInformation.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(95, 113, 320, 25);
		textPane_2.setText(studentData.getFirstName());
		tabInformation.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(95, 159, 320, 25);
		textPane_3.setText(studentData.getMail());
		tabInformation.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBounds(95, 201, 320, 25);
		textPane_4.setText(studentData.getGithubURL());
		tabInformation.add(textPane_4);
		contentPane.add(tabbedPane);
				
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    SimpleDateFormat formatter2= new SimpleDateFormat("HH:mm:ss");
	    String fecha=formatter.format(date);  
	    String hora=formatter2.format(date);
	    
		    
	    JLabel lblNewLabel_1 = new JLabel("Esta ventana fue generada el "+fecha+" a las "+hora);
		lblNewLabel_1.setBounds(28, 274, 407, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		lblNewLabel_2.setBounds(500, 57, 123, 180);
		contentPane.add(lblNewLabel_2);
	}
}
