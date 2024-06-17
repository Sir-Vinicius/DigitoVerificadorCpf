package pack;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InfoDev  extends JFrame{
	 private JPanel contentPane;
	    
	    public InfoDev(){
	        //TELA
	        setTitle("Informacoes do Desenvolvedor");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 480, 300);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5,5,5,5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        contentPane.setBackground(Color.DARK_GRAY);
	        setLocationRelativeTo(null);
	        
	        //TITULO DA JANELA
	        JLabel lblNewLabel = new JLabel("Informacoes do Desenvolvedor");
	        lblNewLabel.setFont(new Font("Arial", Font.BOLD,24));
	        lblNewLabel.setForeground(Color.LIGHT_GRAY);
	        lblNewLabel.setBounds(35,10,360,34);
	        contentPane.add(lblNewLabel);
	        
	        //Inserindo Nome Dev
	        JLabel lblNome = new JLabel("Vinicius dos Santos da Silva");
	        lblNome.setFont(new Font("Arial", Font.BOLD | Font.ITALIC,20));
	        lblNome.setForeground(Color.blue);
	        lblNome.setBounds(40,70,360,34);
	        contentPane.add(lblNome);
	        
	     // Inserindo Link
	        JLabel lblMatri = new JLabel("<html><u>LinkedIn</u></html>");
	        lblMatri.setFont(new Font("Arial", Font.BOLD, 20));
	        lblMatri.setForeground(Color.blue);
	        lblMatri.setBounds(40, 120, 360, 34);
	        lblMatri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        lblMatri.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                if (Desktop.isDesktopSupported()) {
	                    try {
	                        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/vinicius-santos99"));
	                    } catch (IOException | URISyntaxException ex) {
	                        ex.printStackTrace();
	                    }
	                }
	            }
	        });
	        contentPane.add(lblMatri);
	        
	        //BOTAO VOLTAR
	        JButton btnVoltar = new JButton("Voltar");
	        btnVoltar.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent arg0){
	               Menu framemenu = new Menu();
	               framemenu.setVisible(true);
	               dispose();
	           } 
	        });
	        btnVoltar.setFont(new Font("Tohoma", Font.BOLD,11));
	        btnVoltar.setForeground(Color.MAGENTA);
	        btnVoltar.setBounds(185,215,100,23);
	        contentPane.add(btnVoltar);
	    }
}
