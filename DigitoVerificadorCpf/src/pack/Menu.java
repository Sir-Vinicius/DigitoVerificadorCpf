package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame{
	private JPanel contentPane;
    
    public Menu(){
        //TELA
        setTitle("Digito_Verificador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 480, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        
        //TITULO DA JANELA
        JLabel lblNewLabel = new JLabel("Digito Verificador");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD,28));
        lblNewLabel.setForeground(Color.LIGHT_GRAY);
        lblNewLabel.setBounds(120,11,360,34);
        contentPane.add(lblNewLabel);
        
        //BOTAO CPF
        JButton btnCpf = new JButton("Digito verificador do CPF");
        btnCpf.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               DV_CPF frame = new DV_CPF();
               frame.setVisible(true);
               dispose();
           } 
        });
        btnCpf.setFont(new Font("Tohoma", Font.BOLD,11));
        btnCpf.setForeground(Color.magenta);
        btnCpf.setBounds(120,115,230,23);
        contentPane.add(btnCpf);
        
        //BOTAO INFORMACOES DO DESENVOLVEDOR
        JButton btnInf = new JButton("Informações do desenvolvedor");
        btnInf.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               InfoDev frameinfo = new InfoDev();
               frameinfo.setVisible(true);
               dispose();
           } 
        });
        btnInf.setFont(new Font("Tohoma", Font.BOLD,11));
        btnInf.setForeground(Color.magenta);
        btnInf.setBounds(125,165,220,23);
        contentPane.add(btnInf);
        
        //BOTAO SAIR
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               System.exit(0);
           } 
        });
        btnSair.setFont(new Font("Tohoma", Font.BOLD,11));
        btnSair.setForeground(Color.magenta);
        btnSair.setBounds(185,215,100,23);
        contentPane.add(btnSair);
    }
}
