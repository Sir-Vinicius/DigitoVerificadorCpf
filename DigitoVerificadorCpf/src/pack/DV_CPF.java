package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DV_CPF  extends JFrame{
	//COMPONENTES
    private JPanel contentPane;
    JTextField tfCpf, tfDvResult;
//    
    public DV_CPF(){
        //TELA
        setTitle("Digito Verificador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 480, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        
        //TITULO DA JANELA
        JLabel lblNewLabel = new JLabel("Digito Verificador CPF");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD,24));
        lblNewLabel.setForeground(Color.LIGHT_GRAY);
        lblNewLabel.setBounds(105,11,360,34);
        contentPane.add(lblNewLabel);
        
        //Inserindo Texto na Tela
        JLabel lblCpf = new JLabel("Insira os primeiros 9 digitos do CPF:");
        lblCpf.setFont(new Font("Arial", Font.BOLD,13));
        lblCpf.setForeground(Color.blue);
        lblCpf.setBounds(20,50,360,34);
        contentPane.add(lblCpf);
        
        JLabel lblDv = new JLabel("Digito Verificador:");
        lblDv.setFont(new Font("Arial", Font.BOLD,13));
        lblDv.setForeground(Color.blue);
        lblDv.setBounds(80,100,360,34);
        contentPane.add(lblDv);
        
        //INSERINDO CAIXA NA TELA
        tfCpf = new JTextField();
        getContentPane().add(tfCpf);
        tfCpf.setBounds(260,50,85,24);
        
        tfDvResult = new JTextField();
        getContentPane().add(tfDvResult);
        tfDvResult.setBounds(260,105,46,24);
        
        //BOTAO VOLTAR
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               Menu frame = new Menu();
               frame.setVisible(true);
               dispose();
           } 
        });
        btnVoltar.setFont(new Font("Tohoma", Font.BOLD,11));
        btnVoltar.setForeground(Color.magenta);
        btnVoltar.setBounds(315,185,70,23);
        contentPane.add(btnVoltar);
        
        //BOTÃO LIMPAR
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               tfCpf.setText("");
               tfDvResult.setText("");
           }
        });
        btnLimpar.setFont(new Font("Tohoma", Font.BOLD,11));
        btnLimpar.setForeground(Color.magenta);
        btnLimpar.setBounds(215,185,80,23);
        contentPane.add(btnLimpar);
        
        //Botao calcular Digito Verificador
        JButton btnDv = new JButton("Calcular");
        btnDv.setFont(new Font("Tohoma", Font.BOLD,11));
        btnDv.setForeground(Color.magenta);
        btnDv.setBounds(115,185,80,23);
        contentPane.add(btnDv);
        
        btnDv.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               //Calculo digito verificador CPF
               //ETAPA 1
               int soma1 = 0;
               int mult1 = 2;
               String cpf = tfCpf.getText();
               
               for(int i = cpf.length()-1; i >= 0; i --){
                   int num1 = Integer.parseInt(String.valueOf(cpf.charAt(i)));
                   soma1 = soma1 + (num1 * mult1);
                   mult1 ++;
               }
               int resto1;
               soma1 = soma1 * 10;
               resto1 = soma1 % 11;
               
               int dv1;
               
               if(resto1 == 10){
                   dv1 = 0;
               }else{
                   dv1 = resto1;
               }
               
               //ESTAPA 2
               int soma2 = 0;
               int mult2 = 3;
               
               for(int e = cpf.length()-1; e >= 0; e --){
                   int num2 = Integer.parseInt(String.valueOf(cpf.charAt(e)));
                   soma2 = soma2 + (num2 * mult2);
                   mult2 ++;
               }
               
               int resto2;
               soma2 = (soma2 + (dv1 * 2)) * 10;
               resto2 = soma2 % 11;
               
               int dv2;
               
               if(resto2 == 10){
                   dv2 = 0;
               }else{
                   dv2 = resto2;
               }
               
               //ETAPA 3
               int dvResult = (dv1*10);
               if(dv1 == 0){
                   tfDvResult.setText(dvResult + "" + dv2);
               }else{
                   tfDvResult.setText(dvResult + dv2 + "");
               }
           } 
        });
    }
}
